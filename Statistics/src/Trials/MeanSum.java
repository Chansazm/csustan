package Trials;

import java.io.File;
import java.io.Reader;
import java.util.Scanner;

public class MeanSum {
    public static double meanCalculation(double[] values) {
        double sum = 0;
        double mean = 0;
        double n = values.length;
        for (int i = 0; i < n; i++) {
            sum += values[i];
            mean = sum / n;

        }
        return mean;

    }

    public static void main(String[] args) {
        System.out.println("Enter File name: ");

        Scanner scanner = new Scanner(System.in);

        float sum = 0;
        float num = 0;
        while (scanner.hasNextFloat()){

            sum += scanner.nextFloat();
        }
        System.out.println(sum);
    }
}
