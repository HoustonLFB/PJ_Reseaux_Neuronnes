package Neurone;

/**
 * Classe Neurone.NeuroneCache
 * Représente un neurone de la couche cachée d'un réseau de neurones.
 */
public class NeuroneCache extends Neurone{

    public NeuroneCache(double[] poids, double biais) {
        super(poids, biais);
    }


    /**
     * Méthode activate qui calcule la sortie du neurone de la couche cachée. LINAIRE
     * @param entrees Les valeurs d'entrée du neurone.
     * @return La sortie du neurone.
     */
    @Override
    public double activate(double[] entrees) {
        double somme = 0;
        for (int i = 0; i < entrees.length; i++) {
            somme += entrees[i] * poids[i];
        }
        return (somme + biais);
    }
}
