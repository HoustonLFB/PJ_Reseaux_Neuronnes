import Couche.CoucheEntree;
import Couche.CoucheSortie;
import Neurone.NeuroneEntree;
import Neurone.NeuroneSortie;

import java.util.Arrays;

/**
 * Classe principale du programme
 */
public class Main {
    public static void main(String[] args) {
        //ET logique
        //etLogique();

        //OU logique
        //
        // ouLogique();

        //NO logique
        //noLogique();
        }

public static void ouLogique() {
        NeuroneEntree neuroneEntree1 = new NeuroneEntree(new double[]{1.0}, 0.0);
        NeuroneEntree neuroneEntree2 = new NeuroneEntree(new double[]{1.0}, 0.0);
        NeuroneSortie neuroneSortie = new NeuroneSortie(new double[]{1.0, 1.0}, -2.0);

        // Création des couches
        CoucheEntree coucheEntree = new CoucheEntree(new NeuroneEntree[]{neuroneEntree1, neuroneEntree2});
        CoucheSortie coucheSortie = new CoucheSortie(new NeuroneSortie[]{neuroneSortie});

        // Création du réseau
        Reseau reseau = new Reseau(new CoucheEntree[]{coucheEntree}, null, new CoucheSortie[]{coucheSortie});

        // Test du réseau avec des échantillons
        double[][] echantillons = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        for (double[] echantillon : echantillons) {
            double[] sortie = reseau.feedForward(echantillon);
            System.out.println("Entrée : " + Arrays.toString(echantillon) + ", Sortie : " + Arrays.toString(sortie));
        }
    }
        public static void etLogique() {
            NeuroneEntree neuroneEntree1 = new NeuroneEntree(new double[]{1.0}, 0.0);
            NeuroneEntree neuroneEntree2 = new NeuroneEntree(new double[]{1.0}, 0.0);
            NeuroneSortie neuroneSortie = new NeuroneSortie(new double[]{1.0, 1.0}, -2.0);

            // Création des couches
            CoucheEntree coucheEntree = new CoucheEntree(new NeuroneEntree[]{neuroneEntree1, neuroneEntree2});
            CoucheSortie coucheSortie = new CoucheSortie(new NeuroneSortie[]{neuroneSortie});

            // Création du réseau
            Reseau reseau = new Reseau(new CoucheEntree[]{coucheEntree}, null, new CoucheSortie[]{coucheSortie});

            // Test du réseau avec des échantillons
            double[][] echantillons = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
            for (double[] echantillon : echantillons) {
                double[] sortie = reseau.feedForward(echantillon);
                System.out.println("Entrée : " + Arrays.toString(echantillon) + ", Sortie : " + Arrays.toString(sortie));
            }
        }

    public static void noLogique() {
        NeuroneEntree neuroneEntree1 = new NeuroneEntree(new double[]{1.0}, 0.0);
        NeuroneEntree neuroneEntree2 = new NeuroneEntree(new double[]{1.0}, 0.0);
        NeuroneSortie neuroneSortie = new NeuroneSortie(new double[]{1.0, -2.0}, 0.0);

        // Création des couches
        CoucheEntree coucheEntree = new CoucheEntree(new NeuroneEntree[]{neuroneEntree1, neuroneEntree2});
        CoucheSortie coucheSortie = new CoucheSortie(new NeuroneSortie[]{neuroneSortie});

        // Création du réseau
        Reseau reseau = new Reseau(new CoucheEntree[]{coucheEntree}, null, new CoucheSortie[]{coucheSortie});

        // Test du réseau avec des échantillons
        double[][] echantillons = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        for (double[] echantillon : echantillons) {
            double[] sortie = reseau.feedForward(echantillon);
            System.out.println("Entrée : " + Arrays.toString(echantillon) + ", Sortie : " + Arrays.toString(sortie));
        }
    }
}