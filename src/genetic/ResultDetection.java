package genetic;

import java.util.List;

/**
 * abstract product
 */
public abstract class ResultDetection {
    public static int tryCount = 3;

    /**
     * @return whether the program is over or not as boolean
     */
    public abstract boolean isFinished();

    /**
     * @param population current population
     * @param fitness    fitness scores of current population
     */
    public abstract void detectResult(List<List<Integer>> population, List<Integer> fitness);
}
