package genetic;

import behaviour.CrossoverBehaviour;
import behaviour.MutationBehaviour;
import behaviour.SelectionBehaviour;

import java.util.List;

/**
 * abstract product
 */
public abstract class NextGeneration {
    private SelectionBehaviour selectionBehaviour;
    private CrossoverBehaviour crossoverBehaviour;
    private MutationBehaviour mutationBehaviour;

    /**
     * set selection behaviour
     * @param selectionBehaviour the selection behaviour
     */
    public void setSelectionBehaviour(SelectionBehaviour selectionBehaviour) {
        this.selectionBehaviour = selectionBehaviour;
    }

    /**
     * set crossover behaviour
     * @param crossoverBehaviour the crossover behaviour
     */
    public void setCrossoverBehaviour(CrossoverBehaviour crossoverBehaviour) {
        this.crossoverBehaviour = crossoverBehaviour;
    }

    /**
     * set mutation behaviour
     * @param mutationBehaviour the mutation behaviour
     */
    public void setMutationBehaviour(MutationBehaviour mutationBehaviour) {
        this.mutationBehaviour = mutationBehaviour;
    }

    /**
     *
     * @return the selection behaviour
     */
    public SelectionBehaviour getSelectionBehaviour() {
        return selectionBehaviour;
    }

    /**
     *
     * @return the crossover behaviour
     */
    public CrossoverBehaviour getCrossoverBehaviour() {
        return crossoverBehaviour;
    }

    /**
     *
     * @return the mutation behaviour
     */
    public MutationBehaviour getMutationBehaviour() {
        return mutationBehaviour;
    }

    /**
     * call strategies here
     * @param population the current population
     * @param fitnessOfPopulation fitness scores of current population
     * @return the next population
     */
    public abstract List<List<Integer>> generateNextGeneration(List<? extends List<Integer>> population, List<Integer> fitnessOfPopulation);
}
