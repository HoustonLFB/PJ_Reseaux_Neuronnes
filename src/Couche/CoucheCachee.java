package Couche;

import Neurone.Neurone;

/**
 * Classe CoucheCachee
 * Représente une couche cachée dans un réseau de neurones.
 * Hérite de la classe Couche.
 */
public class CoucheCachee extends Couche{

    /**
     * Constructeur de la classe CoucheCachee.
     * @param neurones Un tableau de neurones qui composent cette couche.
     */
    public CoucheCachee(Neurone[] neurones) {
        super(neurones, TypeCouche.CACHEE);
    }

    /**
     * Traite les entrées fournies et produit une sortie.
     * @param entrees Un tableau de doubles représentant les entrées à traiter.
     * @return Un tableau de doubles représentant la sortie de chaque neurone.
     */
    public double[] processInputs(double[] entrees) {
        double[] sortie = new double[neurones.length];
        for (int i = 0; i < neurones.length; i++) {
            sortie[i] = neurones[i].activate(entrees);
        }
        return sortie;

    }
}
