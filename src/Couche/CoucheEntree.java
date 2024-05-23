package Couche;

import Neurone.Neurone;

/**
 * Classe représentant une couche d'entrée du réseau de neurones
 */
public class CoucheEntree extends Couche {

    public CoucheEntree(Neurone[] neurones) {
        super(neurones, TypeCouche.ENTREE);
    }

    public double[] processInputs(double[] inputs) {
        double[] outputs = new double[neurones.length];
            for (int i = 0; i < neurones.length; i++) {
            outputs[i] = neurones[i].activate(inputs);
        }
            return outputs;
    }
}
