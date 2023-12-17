package genetic;

import java.util.List;

public abstract class ResultDetection {
    public static int tryCount = 3;

    public abstract boolean isFinished();
    public abstract String detectResult(List<List<Integer>> population, List<Integer> fitness);
}
