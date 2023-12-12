package genetic;

public class GeneticAlgorithmManager {

    private static GeneticAlgorithmFactory geneticAlgorithmFactory;
    private static InitialPopulation initialPopulation;

    /**
     * private constructor for singleton implementation
     */
    private GeneticAlgorithmManager() {
    }

    /**
     * @param factoryKey the key value for concrete factory selection
     * @return the singleton instance of GeneticAlgorithmManager
     */
    public static GeneticAlgorithmManager getInstance(String factoryKey) {
        geneticAlgorithmFactory = GeneticAlgorithm.factoryHashMap.get(factoryKey);
        initialPopulation = geneticAlgorithmFactory.createInitialPopulation();
        return GeneticAlgorithmManagerHelper.INSTANCE;
    }

    public String runGeneticAlgorithm() {
        initialPopulation.generateInitialPopulation(4);
        return "result";
    }

    /**
     * inner class for supplying singleton instance
     */
    private static class GeneticAlgorithmManagerHelper {
        private static final GeneticAlgorithmManager INSTANCE = new GeneticAlgorithmManager();
    }
}
