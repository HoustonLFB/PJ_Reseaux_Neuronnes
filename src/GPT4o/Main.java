package GPT4o;

public class Main {
    public static void main(String[] args) {
        // Définir les échantillons d'entraînement pour la porte AND
        Echantillon[] echantillons = new Echantillon[]{
                new Echantillon(new double[]{0, 0}, new double[]{0}),
                new Echantillon(new double[]{0, 1}, new double[]{0}),
                new Echantillon(new double[]{1, 0}, new double[]{0}),
                new Echantillon(new double[]{1, 1}, new double[]{1}),
        };

        LotEchantillons lotEchantillons = new LotEchantillons(echantillons);

        // Créer un réseau de neurones avec 2 neurones d'entrée, 1 couche cachée avec 2 neurones, et 1 neurone de sortie
        ReseauDeNeurones reseau = new ReseauDeNeurones(2, new int[]{2}, 1);

        // Entraîner le réseau de neurones
        entrainerReseau(reseau, lotEchantillons, 0.1, 10000);

        // Tester le réseau de neurones
        testerReseau(reseau, new double[]{0, 0});
        testerReseau(reseau, new double[]{0, 1});
        testerReseau(reseau, new double[]{1, 0});
        testerReseau(reseau, new double[]{1, 1});
    }

    public static void entrainerReseau(ReseauDeNeurones reseau, LotEchantillons lotEchantillons, double tauxApprentissage, int epochs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (Echantillon echantillon : lotEchantillons.getEchantillons()) {
                double[] sortieReelle = reseau.calculerSortie(echantillon.getValeursEntree());
                double[] sortieDesiree = echantillon.getValeursSouhaitees();

                // Calculer l'erreur
                double erreur = sortieDesiree[0] - sortieReelle[0];

                // Ajuster les poids et les biais (backpropagation simplifiée)
                for (Neurone neurone : reseau.coucheSortie.neurones) {
                    for (int i = 0; i < neurone.poids.length; i++) {
                        neurone.poids[i] += tauxApprentissage * erreur * echantillon.getValeursEntree()[i];
                    }
                    neurone.biais += tauxApprentissage * erreur;
                }
            }
        }
    }

    public static void testerReseau(ReseauDeNeurones reseau, double[] entree) {
        double[] sortie = reseau.calculerSortie(entree);
        System.out.println("Entrée: " + entree[0] + ", " + entree[1] + " -> Sortie: " + sortie[0]);
    }
}

