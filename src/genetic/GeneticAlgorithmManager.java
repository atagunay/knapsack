package genetic;

public class GeneticAlgorithmManager {

    private static GeneticAlgorithmFactory geneticAlgorithmFactory;

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
        return GeneticAlgorithmManagerHelper.INSTANCE;
    }

    public String runGeneticAlgorithm() {
        return "result";
    }

    /**
     * inner class for supplying singleton instance
     */
    private static class GeneticAlgorithmManagerHelper {
        private static final GeneticAlgorithmManager INSTANCE = new GeneticAlgorithmManager();
    }
}
