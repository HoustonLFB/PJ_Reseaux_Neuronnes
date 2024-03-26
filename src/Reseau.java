public class Reseau {
    private Neurone outputNeuron;

    public Reseau() {
        // Initialize the weights and bias for the output neuron.
        double[] weights = {1, 1}; // Ajustement pour l'opération ET
        double bias = 0.5; // Ajustement pour l'opération ET
        outputNeuron = new Neurone(weights, bias);
    }

    public double predict(double x, double y) {
        double[] inputs = {x, y};
        return outputNeuron.activate(inputs);
    }

    public void testLotEchantillons(LotEchantillons lot) {
        for (Echantillon echantillon : lot.getEchantillons()) {
            double[] inputs = echantillon.getInputs();
            double predicted = predict(inputs[0], inputs[1]);
            System.out.println("Entrées: " + inputs[0] + ", " + inputs[1] +
                    " - Sortie attendue: " + echantillon.getExpectedOutput() +
                    " - Prédiction: " + predicted);
        }
    }
}