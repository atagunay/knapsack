package genetic;

import behaviour.HalfElementCrossover;
import behaviour.RandomMutation;
import behaviour.TournamentSelection;

import java.util.List;

/**
 * singleton class
 */
public class GeneticAlgorithmManager {

    private static InitialPopulation initialPopulation;
    private static FitnessCalculation fitnessCalculation;

    private static NextGeneration nextGeneration;

    private static ResultDetection resultDetection;

    /**
     * private constructor for singleton implementation
     */
    private GeneticAlgorithmManager() {
    }

    /**
     * @param factoryKey the key value for concrete factory selection
     * @return the singleton instance of GeneticAlgorithmManager
     */
    public static GeneticAlgorithmManager getInstance(String factoryKey) {
        GeneticAlgorithmFactory geneticAlgorithmFactory = GeneticAlgorithm.factoryHashMap.get(factoryKey);

        initialPopulation = geneticAlgorithmFactory.createInitialPopulation();
        fitnessCalculation = geneticAlgorithmFactory.createFitnessCalculation();
        resultDetection = geneticAlgorithmFactory.createResultDetection();
        nextGeneration = geneticAlgorithmFactory.createNextGeneration();

        nextGeneration.setSelectionBehaviour(new TournamentSelection());
        nextGeneration.setCrossoverBehaviour(new HalfElementCrossover());
        nextGeneration.setMutationBehaviour(new RandomMutation());

        return GeneticAlgorithmManagerHelper.INSTANCE;
    }

    /**
     * Main process for Genetic Algorithm
     */
    public void runGeneticAlgorithm() {
        List<List<Integer>> population = null;
        List<Integer> fitnessOfPopulation = null;
        List<List<Integer>> nextPopulation = null;

        while (!resultDetection.isFinished()){
            population = initialPopulation.generateInitialPopulation(6);
            fitnessOfPopulation = fitnessCalculation.calculateFitness(population);
            nextPopulation = nextGeneration.generateNextGeneration(population, fitnessOfPopulation);
        }

        resultDetection.detectResult(nextPopulation, fitnessOfPopulation);
    }

    /**
     * inner class for supplying singleton instance
     */
    private static class GeneticAlgorithmManagerHelper {
        private static final GeneticAlgorithmManager INSTANCE = new GeneticAlgorithmManager();
    }
}
