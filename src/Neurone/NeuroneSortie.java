package Neurone;

/**
 * Classe Neurone.NeuroneSortie
 * Représente un neurone de la couche de sortie d'un réseau de neurones.
 */
public class NeuroneSortie extends Neurone{

    public NeuroneSortie(double[] poids, double biais) {
        super(poids, biais);
    }

    @Override
    public double activate(double[] inputs) {
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
