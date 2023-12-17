package knapsack;

import genetic.ResultDetection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * concrete product
 */
public class KSResultDetection extends ResultDetection {

    /**
     * @return whether the program is over or not as boolean
     */
    @Override
    public boolean isFinished() {
        if (tryCount > 0) {
            tryCount = tryCount - 1;
            return false;
        }

        return true;
    }

    /**
     * @param population current population
     * @param fitness    fitness scores of current population
     * @return optimum solution as String
     */
    @Override
    public String detectResult(List<List<Integer>> population, List<Integer> fitness) {
        int max = 0;
        int maxIndex = 0;
        String result = "";

        for (int i = 0; i < fitness.size(); i++) {
            if (fitness.get(i) > max) {
                max = fitness.get(i);
                maxIndex = i;
            }
        }

        return population.get(maxIndex).toString();
    }
}
