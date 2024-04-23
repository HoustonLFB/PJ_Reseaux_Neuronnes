public class NeuroneEntree extends Neurone{
    private double[] poids;

    public NeuroneEntree(double[] poids, double biais) {
        super(poids, biais);
    }

    double activate(double[] entrees) {
        double somme = 0;
        for (int i = 0; i < entrees.length; i++) {
            somme += entrees[i] * poids[i];
        }
        return somme + this.biais;
    }

}
