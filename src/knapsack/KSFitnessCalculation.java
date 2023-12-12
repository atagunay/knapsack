package knapsack;

import genetic.FitnessCalculation;

public class KSFitnessCalculation extends FitnessCalculation {
    @Override
    public int[] calculateFitness(int[][] population) {
        int[] fitness = new int[population.length];

        for (int i = 0; i < population.length; i++) {
            int totalWeight = 0;
            int totalValue = 0;

            totalWeight = population[i][0] * 7 + population[i][1] * 2 + population[i][2] * 1 + population[i][3] * 9;
            totalValue = population[i][0] * 5 + population[i][1] * 4 + population[i][2] * 7 + population[i][3] * 2;

            if (totalWeight < 15) {
                fitness[i] = totalValue;
            }else {
                fitness[i] = 0;
            }
        }

        return fitness;
    }
}
