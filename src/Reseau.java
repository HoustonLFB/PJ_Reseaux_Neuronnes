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
     * @param inputs Les valeurs d'entrée à envoyer à travers le réseau de neurones.
     * @return Les valeurs de sortie de la couche de sortie.
     */
    public double[] feedForward(double[] inputs) {
        double[] outputs = null;

        // Passer les valeurs d'entrée à travers les couches d'entrée
        for (CoucheEntree couche : couchesEntree) {
            outputs = couche.processInputs(inputs);
            inputs = outputs; // Les sorties de la couche actuelle deviennent les entrées de la couche suivante
        }

        // Passer les valeurs à travers les couches cachées
        for (CoucheCachee couche : couchesCachee) {
            outputs = couche.processInputs(inputs);
            inputs = outputs; // Les sorties de la couche actuelle deviennent les entrées de la couche suivante
        }

        // Passer les valeurs à travers les couches de sortie
        for (CoucheSortie couche : couchesSortie) {
            outputs = couche.processInputs(inputs);
        }

        return outputs;
    }
}
