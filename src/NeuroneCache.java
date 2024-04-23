public class NeuroneCache extends Neurone{

    public NeuroneCache(double[] poids, double biais) {
        super(poids, biais);
    }

    double activate(double[] entrees) {
        double sum = 0;
        for (int i = 0; i < poids.length; i++) {
            sum += entrees[i] * poids[i];
        }
        return sigmoid(sum + biais);
    }

    private double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }
}
