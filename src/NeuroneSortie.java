public class NeuroneSortie extends Neurone{

    public NeuroneSortie(double[] poids, double biais) {
        super(poids, biais);
    }

    @Override
    double activate(double[] inputs) {
        double sum = 0;
        for (int i = 0; i < poids.length; i++) {
            sum += inputs[i] * poids[i];
        }
        return sigmoid(sum + biais);
    }

    private double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }
}
