package state;


import genetic.GeneticAlgorithm;

public class Idle implements State {
    private final GeneticAlgorithm geneticAlgorithm;

    /**
     * Constructor
     *
     * @param geneticAlgorithm the instance of GeneticAlgorithm for calling set and get state methods
     */
    public Idle(GeneticAlgorithm geneticAlgorithm) {
        this.geneticAlgorithm = geneticAlgorithm;
    }

    /**
     * Idle state to Complete state
     */
    @Override
    public void nextStep() {
        geneticAlgorithm.setState(geneticAlgorithm.getCompleteState());
        System.out.println("Idle -> Complete");
    }
}
