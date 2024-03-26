public class LotEchantillons {
    private Echantillon[] echantillons; // Le tableau des échantillons

    public LotEchantillons(Echantillon[] echantillons) {
        this.echantillons = echantillons;
    }

    public Echantillon[] getEchantillons() {
        return echantillons;
    }

    // Méthode pour obtenir la taille du lot
    public int taille() {
        return echantillons.length;
    }

    // Ajoutez ici d'autres méthodes utiles pour manipuler le lot d'échantillons, comme des méthodes pour mélanger le lot, itérer sur les échantillons, etc.
}