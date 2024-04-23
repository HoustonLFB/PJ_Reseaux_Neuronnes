public class Reseau {
    private CoucheEntree[] couchesEntree;
    private CoucheCachee[] couchesCachee;
    private CoucheSortie[] couchesSortie;

    public Reseau(CoucheEntree[] couchesEntree, CoucheCachee[] couchesCachee, CoucheSortie[] couchesSortie) {
        this.couchesEntree = couchesEntree;
        this.couchesCachee = couchesCachee;
        this.couchesSortie = couchesSortie;
    }

    public double[] feedForward(double[] inputs) {
        //TODO: Faire l'envoie des valeurs entre les couches
        return null;
    }
}
