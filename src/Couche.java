public abstract class Couche  {
    protected int nbNeurones;
    protected Neurone[] neurones;
    protected TypeCouche type;

    public Couche(Neurone[] neurones, TypeCouche type) {
        this.neurones = neurones;
        this.type = type;
    }

    public abstract double[] processInputs(double[] inputs);
}
