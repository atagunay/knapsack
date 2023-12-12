package genetic;

public class GeneticAlgorithmManager {

    private static GeneticAlgorithmFactory geneticAlgorithmFactory;
    private static InitialPopulation initialPopulation;
    private static FitnessCalculation fitnessCalculation;

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
        geneticAlgorithmFactory = GeneticAlgorithm.factoryHashMap.get(factoryKey);
        initialPopulation = geneticAlgorithmFactory.createInitialPopulation();
        fitnessCalculation = geneticAlgorithmFactory.createFitnessCalculation();
        resultDetection = geneticAlgorithmFactory.createResultDetection();
        return GeneticAlgorithmManagerHelper.INSTANCE;
    }

    public String runGeneticAlgorithm() {
        int[][] population = null;
        int[] fitnessOfPopulation = null;

        while (!resultDetection.isFinished()){
            population = initialPopulation.generateInitialPopulation(6);
            fitnessOfPopulation = fitnessCalculation.calculateFitness(population);
        }

        return resultDetection.detectResult(population, fitnessOfPopulation);
    }

    /**
     * inner class for supplying singleton instance
     */
    private static class GeneticAlgorithmManagerHelper {
        private static final GeneticAlgorithmManager INSTANCE = new GeneticAlgorithmManager();
    }
}
