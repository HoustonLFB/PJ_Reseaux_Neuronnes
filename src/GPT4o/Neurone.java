package GPT4o;

abstract class Neurone {
    protected double[] poids;
    protected double biais;

    public Neurone(int nombreDePoids) {
        this.poids = new double[nombreDePoids];
        this.biais = 0.0;
    }

    public abstract double[] calculerSortie(double[] entree);
}