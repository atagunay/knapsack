package genetic;

import java.util.List;

public abstract class InitialPopulation {
    public abstract <T extends Number> List<List<T>> generateInitialPopulation(int count);
}
