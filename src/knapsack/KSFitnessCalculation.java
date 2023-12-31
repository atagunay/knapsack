package knapsack;

import genetic.FitnessCalculation;

import java.util.ArrayList;
import java.util.List;

/**
 * concrete product
 */
public class KSFitnessCalculation extends FitnessCalculation {

    /**
     * @param population - the current population for calculating their fitness scores
     * @return fitness scores as List<Integer>
     */
    @Override
    public List<Integer> calculateFitness(List<? extends List<? extends Integer>> population) {
        List<Integer> fitness = new ArrayList<>();

        for (int i = 0; i < population.size(); i++) {
            int totalWeight = 0;
            int totalValue = 0;


            totalWeight = population.get(i).get(0) * KnapsackSettings.WEIGHT1 + population.get(i).get(1) * KnapsackSettings.WEIGHT2 +
                    population.get(i).get(2) * KnapsackSettings.WEIGHT3 + population.get(i).get(3) * KnapsackSettings.WEIGHT4;

            totalValue = population.get(i).get(0) * KnapsackSettings.VALUE1 + population.get(i).get(1) * KnapsackSettings.VALUE2 +
                    population.get(i).get(2) * KnapsackSettings.VALUE3 + population.get(i).get(3) * KnapsackSettings.VALUE4;

            if (totalWeight < 15) {
                fitness.add(totalValue);
            } else {
                fitness.add(0);
            }
        }

        return fitness;
    }
}
