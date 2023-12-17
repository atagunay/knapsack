package behaviour;


import java.util.ArrayList;
import java.util.List;

/**
 * a selection behaviour
 */
public class TournamentSelection implements SelectionBehaviour {
    /**
     * One good selection criteria is Tournament Selection, which randomly picks two individuals and runs a virtual tournament.
     * The one having the higher fitness coefficient wins.
     *
     * @param population          the current population
     * @param fitnessOfPopulation the fitness scores of current population
     * @param <T>                 extends Number
     * @return new parents
     */
    @Override
    public <T extends Number> List<List<T>> select(List<? extends List<T>> population, List<T> fitnessOfPopulation) {
        List<List<T>> parents = new ArrayList<>();

        if (fitnessOfPopulation.get(0).intValue() > fitnessOfPopulation.get(1).intValue()) {
            parents.add(population.get(0));
        } else {
            parents.add(population.get(1));
        }

        if (fitnessOfPopulation.get(2).intValue() > fitnessOfPopulation.get(3).intValue()) {
            parents.add(population.get(2));
        } else {
            parents.add(population.get(3));
        }

        return parents;
    }
}
