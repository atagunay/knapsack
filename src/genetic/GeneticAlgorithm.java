package genetic;

import knapsack.KSFactory;
import state.Complete;
import state.Idle;
import state.State;
import java.util.Map;

public class GeneticAlgorithm {
    private State state;
    final private State idleState;
    final private State completeState;

    public static Map<String, GeneticAlgorithmFactory> factoryHashMap = Map.of(
            "knapsack", new KSFactory()
    );

    private final String factoryKey;

    /**
     *
     * @param factoryKey the key for factory selection, eg: "knapsack" calls KSFactory
     */
    public GeneticAlgorithm(String factoryKey) {
        this.factoryKey = factoryKey;
        this.idleState = new Idle(this);
        this.completeState = new Complete(this);
        this.state = this.idleState;
    }

    /**
     * @return an instance of IdleState
     */
    public State getIdleState() {
        return idleState;
    }

    /**
     * @return an instance of CompleteState
     */
    public State getCompleteState() {
        return completeState;
    }

    /**
     * @return current state of the class
     */
    public State getState() {
        return state;
    }

    public String getFactoryKey() {
        return factoryKey;
    }

    /**
     * @param state the new state for updating
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * call nextStep() method of current state
     */
    public void nextStep() {
        state.nextStep();
    }
}
