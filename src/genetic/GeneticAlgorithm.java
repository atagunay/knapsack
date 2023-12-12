package genetic;

import state.Complete;
import state.Idle;
import state.State;

public class GeneticAlgorithm {
    private State state;
    final private State idleState;
    final private State completeState;

    public GeneticAlgorithm(){
        this.idleState = new Idle(this);
        this.completeState = new Complete(this);
        this.state = this.idleState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getCompleteState() {
        return completeState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextStep(){
        state.nextStep();
    }
}
