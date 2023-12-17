package knapsack;

import core.ResultPresentation;
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
     */
    @Override
    public void detectResult(List<List<Integer>> population, List<Integer> fitness) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < fitness.size(); i++) {
            if (fitness.get(i) > max) {
                max = fitness.get(i);
                maxIndex = i;
            }
        }

        ResultPresentation<List<Integer>> resultPresentation = new ResultPresentation<>(population.get(maxIndex));
        resultPresentation.prettyPrint();
    }
}
