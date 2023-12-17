package behaviour;

import java.util.List;

/**
 * Interface for different types of crossover classes
 */
public interface CrossoverBehaviour {
    /**
     * @param parents the parents of the current population
     * @return the new parents
     */
    List<List<Integer>> crossover(List<List<Integer>> parents);
}
