package genetic;

public interface GeneticAlgorithmFactory {
    /**
     *
     * @return the InitialPopulation for a specific factory
     */
    InitialPopulation createInitialPopulation();

    /**
     *
     * @return the FitnessCalculation for a specific factory
     */
    FitnessCalculation createFitnessCalculation();

    /**
     *
     * @return the NextGeneration for a specific factory
     */
    NextGeneration createNextGeneration();

    /**
     *
     * @return the ResultDetection for a specific factory
     */
    ResultDetection createResultDetection();
}
