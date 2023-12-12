package state;


import genetic.GeneticAlgorithm;
import genetic.GeneticAlgorithmManager;

public class Idle implements State {
    private final GeneticAlgorithm geneticAlgorithm;
    private GeneticAlgorithmManager geneticAlgorithmManager;

    /**
     * Constructor
     *
     * @param geneticAlgorithm the instance of GeneticAlgorithm for calling set and get state methods
     */
    public Idle(GeneticAlgorithm geneticAlgorithm) {
        this.geneticAlgorithm = geneticAlgorithm;
        this.geneticAlgorithmManager = GeneticAlgorithmManager.getInstance();
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
