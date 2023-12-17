package genetic;

import java.util.List;

/**
 * abstract product
 */
public abstract class FitnessCalculation {
    /**
     * Calculate fitness scores of current population
     * @param population the current population
     * @return the fitness scores
     */
    public abstract List<Integer> calculateFitness(List<? extends List<? extends Integer>> population);
}
