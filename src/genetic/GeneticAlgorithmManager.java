package genetic;

public class GeneticAlgorithmManager {
    /**
     * private constructor for singleton implementation
     */
    private GeneticAlgorithmManager(){
    }

    /**
     *
     * @return the singleton instance of GeneticAlgorithmManager
     */
    public static GeneticAlgorithmManager getInstance() {
        return GeneticAlgorithmManagerHelper.INSTANCE;
    }

    /**
     * inner class for supplying singleton instance
     */
    private static class GeneticAlgorithmManagerHelper{
        private static final GeneticAlgorithmManager INSTANCE = new GeneticAlgorithmManager();
    }
}
