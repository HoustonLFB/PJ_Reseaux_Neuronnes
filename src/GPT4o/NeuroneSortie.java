package GPT4o;

class NeuroneSortie extends Neurone {

    public NeuroneSortie(int nombreDePoids) {
        super(nombreDePoids);
    }

    @Override
    public double[] calculerSortie(double[] entree) {
        double somme = 0.0;
        for (int i = 0; i < entree.length; i++) {
            somme += entree[i] * poids[i];
        }
        somme += biais;
        double activation = fonctionActivation(somme);
        return new double[]{activation};
    }

    private double fonctionActivation(double somme) {
        return somme; // Fonction linéaire
    }
}
