import Couche.CoucheCachee;
import Couche.CoucheEntree;
import Couche.CoucheSortie;

import java.util.Arrays;

/**
 * Classe Reseau représentant un réseau de neurones.
 * Un réseau de neurones est composé de plusieurs couches : une couche d'entrée, une ou plusieurs couches cachées, et une couche de sortie.
 */
public class Reseau {
    private CoucheEntree[] couchesEntree;
    private CoucheCachee[] couchesCachee;
    private CoucheSortie[] couchesSortie;

    /**
     * Constructeur de la classe Reseau.
     * @param couchesEntree Les couches d'entrée du réseau de neurones.
     * @param couchesCachee Les couches cachées du réseau de neurones.
     * @param couchesSortie Les couches de sortie du réseau de neurones.
     */
    public Reseau(CoucheEntree[] couchesEntree, CoucheCachee[] couchesCachee, CoucheSortie[] couchesSortie) {
        this.couchesEntree = couchesEntree;
        this.couchesCachee = couchesCachee;
        this.couchesSortie = couchesSortie;
    }

    /**
     * Méthode feedForward qui envoie les valeurs d'entrée à travers le réseau de neurones.
     * @param entrees Les valeurs d'entrée à envoyer à travers le réseau de neurones.
     * @return Les valeurs de sortie de la couche de sortie.
     */
    public double[] feedForward(double[] entrees) {
        double[] sortie = entrees;

        if (entrees.length == couchesEntree.length) {
            for (int i = 0; i < entrees.length; i++) {
                sortie[i] = couchesEntree[i].processInputs(entrees)[i];
            }
        }
        if (couchesCachee != null) {
            for (CoucheCachee couche : couchesCachee) {
                sortie = couche.processInputs(sortie);
            }
        }
        for (CoucheSortie couche : couchesSortie) {
            sortie = couche.processInputs(sortie);
        }
        return sortie;
    }
}
