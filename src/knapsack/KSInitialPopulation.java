package knapsack;

import genetic.InitialPopulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * concrete product
 */
public class KSInitialPopulation extends InitialPopulation {
    Random rand = new Random();

    /**
     * @param count the size of the initial population
     * @param <T>   extends Number
     * @return the created population
     */
    @Override
    public <T extends Number> List<List<T>> generateInitialPopulation(int count) {
        List<List<T>> population = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            List<T> individuals = new ArrayList<>();

            for (int j = 0; j < 4; j++) {
                individuals.add((T) Integer.valueOf(rand.nextInt(2)));
            }

            population.add(individuals);
        }

        return population;
    }
}
