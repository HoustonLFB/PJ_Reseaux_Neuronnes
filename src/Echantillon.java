public class Echantillon {
    private double[] inputs; // Les entrées de l'échantillon
    private double expectedOutput; // La sortie attendue pour cet échantillon

    public Echantillon(double[] inputs, double expectedOutput) {
        this.inputs = inputs;
        this.expectedOutput = expectedOutput;
    }

    public double[] getInputs() {
        return inputs;
    }

    public double getExpectedOutput() {
        return expectedOutput;
    }
}


