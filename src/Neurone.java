public abstract class Neurone {
    protected  double[] poids;
    protected  double biais;

    public Neurone(double[] poids, double bias) {
        this.poids = poids;
        this.biais = biais;
    }

    abstract double activate(double[] entrees);
}
