package behaviour;

import java.util.List;

/**
 * Interface for different types of selection classes
 */
public interface SelectionBehaviour {
    /**
     * @param population          the current population
     * @param fitnessOfPopulation the fitness scores of current population
     * @param <T>                 extends Number
     * @return new parents
     */
    <T extends Number> List<List<T>> select(List<? extends List<T>> population, List<T> fitnessOfPopulation);
}
