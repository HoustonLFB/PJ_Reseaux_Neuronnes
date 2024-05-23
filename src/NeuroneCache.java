public class NeuroneCache extends Neurone{

    public NeuroneCache(double[] poids, double biais) {
        super(poids, biais);
    }

    @Override
    double activate(double[] inputs) {
        double sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * poids[i];
        }
        return sigmoid(sum + biais);
    }

    private double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }
}
