package main;

import genetic.GeneticAlgorithm;
import genetic.GeneticAlgorithmSettings;

/**
 * main class
 */
public class Main {
    public static void main(String[] args) {
        // Set constant variables
        GeneticAlgorithmSettings.REPRODUCTION_RATE = 0.25;
        GeneticAlgorithmSettings.MUTATION_RATE = 0.10;
        GeneticAlgorithmSettings.CROSSOVER_RATE = 0.50;

        // Select problem to solve with GA
        GeneticAlgorithm ga = new GeneticAlgorithm("knapsack");

        // Run GA
        // Idle to complete state
        ga.nextStep();

        // Complete to idle state
        ga.nextStep();
    }
}
