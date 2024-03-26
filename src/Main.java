public class Main {
    public static void main(String[] args) {
        Reseau network = new Reseau();

        // Création des échantillons pour le test de l'opération ET
        Echantillon[] echantillons = {
                new Echantillon(new double[]{0, 0}, 0),
                new Echantillon(new double[]{0, 1}, 1),
                new Echantillon(new double[]{1, 0}, 1),
                new Echantillon(new double[]{1, 1}, 1)
        };
        LotEchantillons lot = new LotEchantillons(echantillons);

        // Test des échantillons avec le réseau
        network.testLotEchantillons(lot);
    }
}