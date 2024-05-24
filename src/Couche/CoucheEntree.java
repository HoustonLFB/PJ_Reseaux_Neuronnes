package Couche;

import Couche.Couche;
import Neurone.Neurone;

/**
 * Classe CoucheEntree
 * Représente une couche d'entrée dans un réseau de neurones.
 * Hérite de la classe Couche.
 */
public class CoucheEntree extends Couche {

    /**
     * Constructeur de la classe CoucheEntree.
     * @param neurones Un tableau de neurones qui composent cette couche.
     */
    public CoucheEntree(Neurone[] neurones) {
        super(neurones, TypeCouche.ENTREE);
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
