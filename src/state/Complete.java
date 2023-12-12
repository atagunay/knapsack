package state;

import genetic.GeneticAlgorithm;

public class Complete implements State {
    GeneticAlgorithm geneticAlgorithm;

    /**
     * Constructor
     *
     * @param geneticAlgorithm the instance of GeneticAlgorithm for calling set and get state methods
     */
    public Complete(GeneticAlgorithm geneticAlgorithm) {
        this.geneticAlgorithm = geneticAlgorithm;
    }

    /**
     * Complete state to idle state
     */
    @Override
    public void nextStep() {
        geneticAlgorithm.setState(geneticAlgorithm.getIdleState());
        System.out.println("Complete -> Idle");
    }
}
