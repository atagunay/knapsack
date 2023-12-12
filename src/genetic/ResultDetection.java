package genetic;

public abstract class ResultDetection {
    public static int tryCount = 3;

    public abstract boolean isFinished();
    public abstract String detectResult(int[][] population, int[] fitness);
}
