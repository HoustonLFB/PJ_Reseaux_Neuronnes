package Neurone;

/**
 * Classe Neurone.NeuroneEntree
 * Représente un neurone de la couche d'entrée d'un réseau de neurones.
 */
public class NeuroneEntree extends Neurone{

    public NeuroneEntree(double[] poids, double biais) {
        super(poids, biais);
    }

    public double activate(double[] entrees) {
        double somme = 0;
        for (int i = 0; i < entrees.length && i < poids.length; i++) {
            somme += entrees[i] * poids[i];
        }
        return somme; // Pas de biais pour les neurones d'entrée
    }

}
