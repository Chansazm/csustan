package Trials;

import java.io.*;
import java.util.*;

public class ProcessNumbers {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/chansa/Downloads/csustan/Statistics/src/Averages/textF.txt"));
        int max = 0;
        int min = 0;
        int sum = 0;
        int count = 0;
        double average = 0;

        System.out.println("Enter file name: ");  //currently a println for ease of reading via Run

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int number = input.nextInt();
                sum += number;
                count++;
                average = (double) (sum) / count;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                input.next();
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
        System.out.println("average = " + average);
    }

}