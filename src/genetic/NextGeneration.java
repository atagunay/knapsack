package genetic;

import behaviour.CrossoverBehaviour;
import behaviour.MutationBehaviour;
import behaviour.SelectionBehaviour;

import java.util.List;

public abstract class NextGeneration {
    private SelectionBehaviour selectionBehaviour;
    private CrossoverBehaviour crossoverBehaviour;
    private MutationBehaviour mutationBehaviour;

    public void setSelectionBehaviour(SelectionBehaviour selectionBehaviour) {
        this.selectionBehaviour = selectionBehaviour;
    }

    public void setCrossoverBehaviour(CrossoverBehaviour crossoverBehaviour) {
        this.crossoverBehaviour = crossoverBehaviour;
    }

    public void setMutationBehaviour(MutationBehaviour mutationBehaviour) {
        this.mutationBehaviour = mutationBehaviour;
    }

    public SelectionBehaviour getSelectionBehaviour() {
        return selectionBehaviour;
    }

    public CrossoverBehaviour getCrossoverBehaviour() {
        return crossoverBehaviour;
    }

    public MutationBehaviour getMutationBehaviour() {
        return mutationBehaviour;
    }

    public abstract List<List<Integer>> generateNextGeneration(List<? extends List<Integer>> population, List<Integer> fitnessOfPopulation);
}
