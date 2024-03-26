public class Neurone {
    private double[] weights;
    private double bias;

    public Neurone(double[] weights, double bias) {
        this.weights = weights;
        this.bias = bias;
    }

    public double activate(double[] inputs) {
        double sum = 0.0;
        for (int i = 0; i < inputs.length; i++) {
            sum += weights[i] * inputs[i];
        }
        sum -= bias;
        return sum > 0 ? 1 : 0; // Simple step activation function
    }
}


