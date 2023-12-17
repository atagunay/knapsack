package behaviour;

import java.util.List;
import java.util.Random;

/**
 * a mutation behaviour
 */
public class RandomMutation implements MutationBehaviour {
    /**
     * The mutation is an evolutionary operation that randomly mutates an individual.
     *
     * @param children     the current children
     * @param mutationRate the mutation rate from Genetic Algorithm Setting Class
     * @return the new children
     */
    @Override
    public List<List<Integer>> mutate(List<List<Integer>> children, double mutationRate) {
        Random random = new Random();

        for (List<Integer> child : children) {
            for (int i = 0; i < child.size(); i++) {
                if (random.nextFloat() < mutationRate) {
                    if (child.get(i) == 1) {
                        child.set(i, 0);
                    } else {
                        child.set(i, 1);
                    }
                }
            }
        }

        return children;
    }
}
