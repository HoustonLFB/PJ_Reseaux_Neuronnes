package Couche;

import Neurone.Neurone;

/**
 * Classe abstraite représentant une couche de neurones dans un réseau de neurones.
 */
public abstract class Couche  {
    // Le nombre de neurones dans cette couche
    protected int nbNeurones;

    // Le tableau des neurones de cette couche
    protected Neurone[] neurones;

    // Le type de cette couche (par exemple, couche d'entrée, couche cachée, couche de sortie)
    protected TypeCouche type;

    /**
     * Constructeur pour la classe Couche.Couche.
     *
     * @param neurones Le tableau des neurones de cette couche
     * @param type Le type de cette couche
     */
    public Couche(Neurone[] neurones, TypeCouche type) {
        this.neurones = neurones;
        this.type = type;
    }

    /**
     * Méthode abstraite pour traiter les entrées de cette couche.
     * Cette méthode doit être implémentée par les sous-classes.
     *
     * @param inputs Les entrées à traiter
     * @return Le tableau des sorties de cette couche
     */
    public abstract double[] processInputs(double[] inputs);
}