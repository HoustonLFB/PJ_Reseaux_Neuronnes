package Couche;

import Neurone.Neurone;
/**
 * Classe CoucheSortie
 * Représente une couche de sortie dans un réseau de neurones.
 * Hérite de la classe Couche.
 */
public class CoucheSortie extends Couche{

    /**
     * Constructeur de la classe CoucheSortie.
     * @param neurones Un tableau de neurones qui composent cette couche.
     */
    public CoucheSortie(Neurone[] neurones) {
        super(neurones, TypeCouche.SORTIE);
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