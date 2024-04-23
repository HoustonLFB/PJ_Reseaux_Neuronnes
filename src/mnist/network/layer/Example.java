package mnist.network.layer;

public class Example {
    private int label;

    private double[] data;

    public Example(String line) {
        String[] split = line.split(",");
        this.label = Integer.parseInt(split[0]);
        this.data = new double[28 * 28];

        for (int i = 1; i < split.length; i++) {
            this.data[i - 1] = Double.parseDouble(split[i]) / 255.0;
        }
    }

    public int getLabel() {
        return this.label;
    }

    public double[] getData() {
        return this.data;
    }
}
