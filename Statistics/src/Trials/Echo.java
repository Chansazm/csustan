package Trials;

import java.io.*; // for File
import java.util.*; // for Scanner
public class Echo {
    public static void main(String[] args) throws FileNotFoundException {
        //Getting the file
        System.out.println("Enter the File name: ");
        //FileReader file = new FileReader();
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        Scanner input = new Scanner(new File(st));
        //Initialising variables
        double sum = 0.0;
        double count = 0.0;
        //looping through the input
        System.out.println("The numbers are:");
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println(next);
            //counting the number of numbers
            count++;
            sum = sum + next;
        }
        //System.out.printf("Sum = %.1f\n", sum);

        //calculating the Mean
        double mean = sum/count;
        //Outputting the Mean
        System.out.println("The Mean is: "+mean +"\nThanks!");
    }
}