package mnist.network;

import mnist.network.layer.Example;
import mnist.network.layer.FullLayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static double[] stringToDoubleArray(String str) {
        // Créer un tableau de doubles de la même taille que la chaîne
        double[] doubleArray = new double[str.length()];

        // Convertir chaque caractère en double et le stocker dans le tableau de doubles
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Convertir le caractère en sa valeur numérique
            int numericValue = Character.getNumericValue(c);
            // Stocker cette valeur numérique dans le tableau de doubles
            doubleArray[i] = (double) numericValue;
        }

        return doubleArray; // Retourner le tableau de doubles
    }

    public static void trainMain(Network network) throws FileNotFoundException {
        List<Example> tests = new ArrayList<>();
        List<Example> examples = new ArrayList<>();



        File csv = new File("C:\\Users\\wilfr\\IdeaProjects\\PJ_Reseaux_Neuronnes\\src\\mnist\\network\\mnist_train.csv");


        Scanner sc = new Scanner(csv);
        sc.nextLine();
        while (sc.hasNextLine()) {
            examples.add(new Example(sc.nextLine()));
        }
        sc.close();

        File csv1 = new File("C:\\Users\\wilfr\\IdeaProjects\\PJ_Reseaux_Neuronnes\\src\\mnist\\network\\mnist_test.csv");

        Scanner sc1 = new Scanner(csv1);

        // Ignore header line
        sc1.nextLine();

        while (sc1.hasNextLine()) {
            tests.add(new Example(sc1.nextLine()));
        }

        sc1.close();

        for (int i = 0; i < 10; i++) {
            System.out.println("EPOCH: " + i);

            Collections.shuffle(examples);

            for (int j = 0; j < examples.size(); j++) {
                Example example = examples.get(j);

                double[] expected = new double[10];
                expected[example.getLabel()] = 1;

                network.train(example.getData(), expected);

                double percentage = ((double) j / (double) examples.size()) * 100;
                System.out.print((int) percentage + "%\t\r");
            }

            System.out.print("\r100%\t\t\t\n");

            int correct = 0;

            for (int j = 0; j < tests.size(); j++) {
                Example example = tests.get(j);

                double[] output = network.run(example.getData());

                if (network.compareExpectedWithOutput(example.getLabel(), output)) {
                    correct++;
                }
            }

            System.out.println("Correct: " + correct + "/" + tests.size());
        }
        System.out.println("DONE");
    }


    public static void main(String[] args) throws FileNotFoundException {
        Network network = new NetworkBuilder().setInput(28 * 28)
                .setOutput(10)
                .appendHiddenLayer(new FullLayer(10))
                .appendHiddenLayer(new FullLayer(25))
                .setTrainingRate(0.1)
                .build();

        trainMain(network);

        network.save("C:\\Users\\wilfr\\IdeaProjects\\PJ_Reseaux_Neuronnes\\src\\mnist\\network\\network.txt");

        String imageString = "0000000000000000000000000000" +
                "0000000000000000000000000000" +
                "0000000000001111000000000000" +
                "0000000001110000110000000000" +
                "0000000110000000011000000000" +
                "0000011000000000001000000000" +
                "0000010000000000001000000000" +
                "0000100000000000001000000000" +
                "0001100000000000001000000000" +
                "0001000000000000010000000000" +
                "0001000000000000010000000000" +
                "0001000000000000100000000000" +
                "0001000000000000100000000000" +
                "0001000000000001000000000000" +
                "0001100000000011000000000000" +
                "0000000000000110000000000000" +
                "0000000000001100000000000000" +
                "0000000000110000000000000000" +
                "0000000011100000000000000000" +
                "0000000110000000000000000000" +
                "0000111000000000000000000000" +
                "0001100000000000000000000000" +
                "0011100000000000000000000000" +
                "0000011111100000000000000000" +
                "0000000000111111111111111000" +
                "0000000000000000011111111000" +
                "0000000000000000000000000000" +
                "0000000000000000000000000000";

        double[] monImage = new double[28 * 28];

        monImage = stringToDoubleArray(imageString);


        System.out.println(Arrays.toString(network.run(monImage)));


}
}
