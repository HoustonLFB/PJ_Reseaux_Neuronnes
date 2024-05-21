package GPT4o;

class Echantillon {
    private double[] valeursEntree;
    private double[] valeursSouhaitees;

    public Echantillon(double[] valeursEntree, double[] valeursSouhaitees) {
        this.valeursEntree = valeursEntree;
        this.valeursSouhaitees = valeursSouhaitees;
    }

    public double[] getValeursEntree() {
        return valeursEntree;
    }

    public double[] getValeursSouhaitees() {
        return valeursSouhaitees;
    }
}



