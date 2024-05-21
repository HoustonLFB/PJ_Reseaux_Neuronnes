package GPT4o;

class ReseauDeNeurones {
    private Couche coucheEntree;
    private Couche[] couchesCachees;
    public Couche coucheSortie;

    public ReseauDeNeurones(int nombreNeuronesEntree, int[] nombreNeuronesCachees, int nombreNeuronesSortie) {
        coucheEntree = new Couche(nombreNeuronesEntree, NeuroneEntree.class, nombreNeuronesCachees[0]);

        couchesCachees = new Couche[nombreNeuronesCachees.length];
        for (int i = 0; i < nombreNeuronesCachees.length; i++) {
            int nombreDePoids = (i == nombreNeuronesCachees.length - 1) ? nombreNeuronesSortie : nombreNeuronesCachees[i + 1];
            couchesCachees[i] = new Couche(nombreNeuronesCachees[i], NeuroneCache.class, nombreDePoids);
        }

        coucheSortie = new Couche(nombreNeuronesSortie, NeuroneSortie.class, 0);
    }

    public double[] calculerSortie(double[] entree) {
        double[] sortie = coucheEntree.calculerSortie(entree);
        for (Couche couche : couchesCachees) {
            sortie = couche.calculerSortie(sortie);
        }
        return coucheSortie.calculerSortie(sortie);
    }
}
