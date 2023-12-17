package state;


import genetic.GeneticAlgorithm;
import genetic.GeneticAlgorithmManager;

/**
 * Idle State (Waiting for start to Genetic Algorithm) implements State
 */
public class Idle implements State {
    private final GeneticAlgorithm geneticAlgorithm;
    private final GeneticAlgorithmManager geneticAlgorithmManager;

    /**
     * constructor
     *
     * @param geneticAlgorithm the instance of GeneticAlgorithm for calling set and get state methods
     */
    public Idle(GeneticAlgorithm geneticAlgorithm) {
        this.geneticAlgorithm = geneticAlgorithm;
        this.geneticAlgorithmManager = GeneticAlgorithmManager.getInstance(geneticAlgorithm.getFactoryKey());
    }

    /**
     * idle state to Complete state,
     * run genetic algorithm
     */
    @Override
    public void nextStep() {
        geneticAlgorithmManager.runGeneticAlgorithm();
        geneticAlgorithm.setState(geneticAlgorithm.getCompleteState());
        System.out.println("Idle -> Complete");
    }
}
