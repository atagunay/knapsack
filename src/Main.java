import genetic.GeneticAlgorithm;

public class Main {
    public static void main(String[] args) {
        GeneticAlgorithm ga = new GeneticAlgorithm("knapsack");
        System.out.println("Current State:" + ga.getState().getClass().getName());
        ga.nextStep();
    }
}
