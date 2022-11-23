package Trials;

// Java Program to illustrate
// reading from Text File
// using Scanner Class
import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner
{
    public static void main(String[] args) throws Exception
    {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String name = prompt.next();

        File file = new File(name);
        Scanner sc = new Scanner(file);
        System.out.println(sc);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }

    public static double meanCalculation(double[] values){
        double sum = 0;
        double mean = 0;
        double n = values.length;
        for (int i = 0; i < n; i++){
            sum += values[i];
            mean = sum/n;

        }
        return mean;


    }

}

