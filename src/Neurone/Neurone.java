package Neurone;

/**
 * Classe abstraite Neurone
 * Cette classe est la classe mère de tous les neurones.
 * Elle contient les attributs poids et biais.
 * Elle contient les méthodes getPoids, setPoids, getBiais, setBiais et activate.
 * La méthode activate est abstraite.
 */
public abstract class Neurone {
    /**
     * Les poids des connexions du neurone.
     */
    protected  double[] poids;

    /**
     * Le biais du neurone.
     */
    protected  double biais;

    /**
     * Constructeur de la classe Neurone.
     * @param poids Les poids des connexions du neurone.
     * @param biais Le biais du neurone.
     */
    public Neurone(double[] poids, double biais) {
        this.poids = poids;
        this.biais = biais;
    }

    /**
     * Récupère les poids des connexions du neurone.
     * @return Un tableau de doubles représentant les poids.
     */
    public double[] getPoids() {
        return poids;
    }

    /**
     * Définit les poids des connexions du neurone.
     * @param poids Un tableau de doubles représentant les nouveaux poids.
     */
    public void setPoids(double[] poids) {
        this.poids = poids;
    }

    /**
     * Récupère le biais du neurone.
     * @return Un double représentant le biais.
     */
    public double getBiais() {
        return biais;
    }

    /**
     * Définit le biais du neurone.
     * @param biais Un double représentant le nouveau biais.
     */
    public void setBiais(double biais) {
        this.biais = biais;
    }

    /**
     * Méthode abstraite pour l'activation du neurone.
     * Doit être implémentée par les classes filles.
     * @param entrees Un tableau de doubles représentant les entrées du neurone.
     * @return Un double représentant la sortie du neurone.
     */
    public abstract double activate(double[] entrees);
}