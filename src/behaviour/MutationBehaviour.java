package behaviour;

import java.util.List;

/**
 * Interface for different types of mutation classes
 */
public interface MutationBehaviour {
    /**
     *
     * @param children the current children
     * @param mutationRate the mutation rate from Genetic Algorithm Setting Class
     * @return the new children
     */
    List<List<Integer>> mutate(List<List<Integer>> children, double mutationRate);
}
