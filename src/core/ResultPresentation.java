package core;

import genetic.GeneticAlgorithmSettings;
import genetic.ResultDetection;

import java.util.List;

/**
 * Pretty print for program outputs
 * @param <T> T extends List<?>
 */
public class ResultPresentation<T extends List<?>> {
    private T result;

    public ResultPresentation(T result) {
        this.result = result;
    }

    /**
     * Pretty print for result
     */
    public void prettyPrint() {
        System.out.println("VOILA!!! You have completed your Genetic Algorithm Process");
        System.out.println("You Genetic Algorithm Settings:");
        System.out.println("Crossover Rate: " + GeneticAlgorithmSettings.CROSSOVER_RATE);
        System.out.println("Mutation Rate: " + GeneticAlgorithmSettings.MUTATION_RATE);
        System.out.println("Reproduction Rate: " + GeneticAlgorithmSettings.REPRODUCTION_RATE);
        System.out.println("Program Output: " + result.toString());
    }
}
