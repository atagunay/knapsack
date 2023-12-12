package state;


import genetic.GeneticAlgorithm;

public class Idle implements State{
    private final GeneticAlgorithm geneticAlgorithm;

    public Idle(GeneticAlgorithm geneticAlgorithm) {
        this.geneticAlgorithm = geneticAlgorithm;
    }

    @Override
    public void nextStep() {
        geneticAlgorithm.setState(geneticAlgorithm.getCompleteState());
        System.out.println("Idle -> Complete");
    }
}
