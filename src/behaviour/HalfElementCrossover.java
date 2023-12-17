package behaviour;

import java.util.List;

/**
 * a crossover behaviour
 */
public class HalfElementCrossover implements CrossoverBehaviour {
    /**
     * Crossover is an evolutionary operation between two individuals, and it generates children having some parts from each parent.
     *
     * @param parents the parents of the current population
     * @return the new parents
     */
    @Override
    public List<List<Integer>> crossover(List<List<Integer>> parents) {
        for (int i = 0; i < parents.get(0).size() / 2; i++) {
            int temp = parents.get(0).get(i);
            parents.get(0).set(i, parents.get(1).get(i));
            parents.get(1).set(i, temp);
        }

        return parents;
    }
}
