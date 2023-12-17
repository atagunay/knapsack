package knapsack;

import genetic.GeneticAlgorithmSettings;
import genetic.NextGeneration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * concrete product
 */
public class KSNextGeneration extends NextGeneration {

    /**
     * @param population          current population
     * @param fitnessOfPopulation fitness scores of current population
     * @return next population as List<List<Integer>>
     */
    @Override
    public List<List<Integer>> generateNextGeneration(List<? extends List<Integer>> population, List<Integer> fitnessOfPopulation) {
        Random random = new Random();
        List<List<Integer>> nextGeneration = new ArrayList<>();

        while (nextGeneration.size() < population.size()) {
            List<List<Integer>> children = null;
            List<List<Integer>> parents = getSelectionBehaviour().select(population, fitnessOfPopulation);

            if (random.nextFloat() < GeneticAlgorithmSettings.REPRODUCTION_RATE) {
                children = parents;
            } else {
                if (random.nextFloat() < GeneticAlgorithmSettings.CROSSOVER_RATE) {
                    children = getCrossoverBehaviour().crossover(parents);
                }

                if (children != null) {
                    children = getMutationBehaviour().mutate(children, GeneticAlgorithmSettings.MUTATION_RATE);
                }
            }

            if (children != null) {
                nextGeneration.addAll(children);
            }
        }

        return nextGeneration.subList(0, population.size());
    }
}
