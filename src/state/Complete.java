package state;

import genetic.GeneticAlgorithm;

public class Complete implements State{
    GeneticAlgorithm geneticAlgorithm;

    public Complete(GeneticAlgorithm geneticAlgorithm) {
        this.geneticAlgorithm = geneticAlgorithm;
    }

    @Override
    public void nextStep() {
        geneticAlgorithm.setState(geneticAlgorithm.getIdleState());
        System.out.println("Complete -> Idle");
    }
}
