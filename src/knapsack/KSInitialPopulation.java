package knapsack;

import genetic.InitialPopulation;
import java.util.Random;

public class KSInitialPopulation extends InitialPopulation {
    Random rand = new Random();

    /**
     *
     * @param count the size of the initial population
     * @return the created population
     */
    @Override
    public int[][] generateInitialPopulation(int count) {
        int[][] population = new int[count][4];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 4; j++) {
                population[i][j] = rand.nextInt(2);
            }
        }

        return population;
    }
}
