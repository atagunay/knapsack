package knapsack;

import genetic.*;

/**
 * knapsack factory - concrete factory
 */
public class KSFactory implements GeneticAlgorithmFactory {
    /**
     * @return the KSInitialPopulation class specifically for knapsack problem
     */
    @Override
    public InitialPopulation createInitialPopulation() {
        return new KSInitialPopulation();
    }

    /**
     * @return KSFitnessCalculation class specifically for knapsack problem
     */
    @Override
    public FitnessCalculation createFitnessCalculation() {
        return new KSFitnessCalculation();
    }

    /**
     * @return the KSNextGeneration class specifically for knapsack problem
     */
    @Override
    public NextGeneration createNextGeneration() {
        return new KSNextGeneration();
    }

    /**
     * @return the KSResultDetection class specifically for knapsack problem
     */
    @Override
    public ResultDetection createResultDetection() {
        return new KSResultDetection();
    }
}
