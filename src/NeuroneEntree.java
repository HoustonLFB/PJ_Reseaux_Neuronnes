/**
 * Classe NeuroneEntree
 * Représente un neurone de la couche d'entrée d'un réseau de neurones.
 */
public class NeuroneEntree extends Neurone{

    public NeuroneEntree(double[] poids, double biais) {
        super(poids, biais);
    }

    double activate(double[] entrees) {
        double somme = 0;
        for (int i = 0; i < entrees.length; i++) {
            somme += entrees[i] * this.poids[i];
        }
        return somme + this.biais;
    }

}
