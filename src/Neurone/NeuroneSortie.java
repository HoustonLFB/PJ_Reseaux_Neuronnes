package Neurone;

/**
 * Classe Neurone.NeuroneSortie
 * Représente un neurone de la couche de sortie d'un réseau de neurones.
 */
public class NeuroneSortie extends Neurone{

    public NeuroneSortie(double[] poids, double biais) {
        super(poids, biais);
    }

    /**
     * Méthode activate qui calcule la sortie du neurone de la couche de sortie. HEAVISIDE
     * @param entrees Les valeurs d'entrée du neurone.
     * @return La sortie du neurone.
     */
    @Override
    public double activate(double[] entrees) {
        double somme = 0;
        for (int i = 0; i < entrees.length; i++) {
            somme += entrees[i] * poids[i];
        }
        somme += biais;
        return somme < 0 ? 0 : 1;
    }
}
