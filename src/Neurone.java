/**
 * Classe abstraite Neurone
 * Cette classe est la classe mère de tous les neurones
 * Elle contient les attributs poids et biais
 * Elle contient les méthodes getPoids, setPoids, getBiais, setBiais et activate
 * La méthode activate est abstraite
 */
public abstract class Neurone {
    protected  double[] poids;
    protected  double biais;

    public Neurone(double[] poids, double biais) {
        this.poids = poids;
        this.biais = biais;
    }

    public double[] getPoids() {
        return poids;
    }

    public void setPoids(double[] poids) {
        this.poids = poids;
    }

    public double getBiais() {
        return biais;
    }

    public void setBiais(double biais) {
        this.biais = biais;
    }

    abstract double activate(double[] entrees);
}
