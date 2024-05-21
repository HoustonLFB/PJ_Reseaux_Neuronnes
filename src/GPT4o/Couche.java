package GPT4o;

public class Couche {
    protected Neurone[] neurones;

    public Couche(int nombreDeNeurones, Class<? extends Neurone> typeDeNeurone, int nombreDePoids) {
        neurones = new Neurone[nombreDeNeurones];
        try {
            for (int i = 0; i < nombreDeNeurones; i++) {
                neurones[i] = typeDeNeurone.getConstructor(int.class).newInstance(nombreDePoids);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double[] calculerSortie(double[] entree) {
        double[] sortie = new double[neurones.length];
        for (int i = 0; i < neurones.length; i++) {
            sortie[i] = neurones[i].calculerSortie(entree)[0];
        }
        return sortie;
    }
}

