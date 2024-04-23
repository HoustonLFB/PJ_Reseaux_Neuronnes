public class CoucheSortie extends Couche{


    public CoucheSortie(Neurone[] neurones) {
        super(neurones, TypeCouche.SORTIE);
    }

    public double[] processInputs(double[] inputs) {
        double[] outputs = new double[neurones.length];
        for (int i = 0; i < neurones.length; i++) {
            outputs[i] = neurones[i].activate(inputs);
        }
        return outputs;
    }
}