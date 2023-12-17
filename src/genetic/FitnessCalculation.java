package genetic;

import java.util.List;

public abstract class FitnessCalculation {
    public abstract List<Integer> calculateFitness(List<? extends List<? extends Integer>> population);
}
