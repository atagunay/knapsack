package genetic;

import java.util.List;

/**
 * abstract product
 */
public abstract class InitialPopulation {
    /**
     *
     * @param count the number of the individuals in a population
     * @return the new population
     * @param <T> extends Number
     */
    public abstract <T extends Number> List<List<T>> generateInitialPopulation(int count);
}
