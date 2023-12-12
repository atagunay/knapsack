import genetic.GeneticAlgorithm;

public class Main {
    public static void main(String[] args) {
        GeneticAlgorithm ga = new GeneticAlgorithm();
        System.out.println("Current State:" + ga.getState().getClass().getName());
        ga.nextStep();
    }
}
