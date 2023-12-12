package knapsack;

import genetic.ResultDetection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KSResultDetection extends ResultDetection {

    @Override
    public boolean isFinished() {
        if(tryCount > 0){
            tryCount = tryCount - 1;
            return false;
        }

        return true;
    }

    @Override
    public String detectResult(int[][] population, int[] fitness) {
        int max = 0;
        int maxIndex = 0;
        String result = "";

        for (int i = 0; i < fitness.length; i++) {
            if(fitness[i] > max){
                max = fitness[i];
                maxIndex = i;
            }
        }

        return Arrays.toString(population[maxIndex]);
    }
}
