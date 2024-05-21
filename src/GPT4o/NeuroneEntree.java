package GPT4o;

class NeuroneEntree extends Neurone {

    public NeuroneEntree(int nombreDePoids) {
        super(nombreDePoids);
    }

    @Override
    public double[] calculerSortie(double[] entree) {
        double[] sortie = new double[poids.length];
        for (int i = 0; i < poids.length; i++) {
            sortie[i] = entree[i] * poids[i];
        }
        return sortie;
    }
}
