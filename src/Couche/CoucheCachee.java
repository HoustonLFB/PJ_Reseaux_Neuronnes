package Couche;

import Neurone.Neurone;

/**
 * Classe représentant une couche cachée du réseau de neurones
 */
public class CoucheCachee extends Couche{

    public CoucheCachee(Neurone[] neurones) {
        super(neurones, TypeCouche.CACHEE);
    }

    public double[] processInputs(double[] inputs) {
        double[] outputs = new double[neurones.length];
        for (int i = 0; i < neurones.length; i++) {
            outputs[i] = neurones[i].activate(inputs);
        }
        return outputs;

    }
}
