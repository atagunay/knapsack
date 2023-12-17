package main;

import genetic.GeneticAlgorithm;
import genetic.GeneticAlgorithmSettings;
import knapsack.KnapsackSettings;

/**
 * main class
 */
public class Main {
    public static void main(String[] args) {
        // Set constant variables
        GeneticAlgorithmSettings.REPRODUCTION_RATE = 0.25;
        GeneticAlgorithmSettings.MUTATION_RATE = 0.10;
        GeneticAlgorithmSettings.CROSSOVER_RATE = 0.50;

        KnapsackSettings.WEIGHT1 = 7;
        KnapsackSettings.WEIGHT2 = 2;
        KnapsackSettings.WEIGHT3 = 1;
        KnapsackSettings.WEIGHT4 = 9;

        KnapsackSettings.VALUE1 = 5;
        KnapsackSettings.VALUE2 = 4;
        KnapsackSettings.VALUE3 = 7;
        KnapsackSettings.VALUE4 = 2;

        // Select problem to solve with GA
        GeneticAlgorithm ga = new GeneticAlgorithm("knapsack");

        // Run GA
        // Idle to complete state
        ga.nextStep();

        // Complete to idle state
        ga.nextStep();
    }
}
