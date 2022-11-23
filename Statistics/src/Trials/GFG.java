package Trials;

// Importing input output classes
import java.io.*;

// Main class
public class GFG {

    // main driver method
    public static void main(String[] args) throws Exception
    {

        // File path is passed as parameter
        File file = new File(
                "/Users/chansa/Downloads/csustan/Statistics/src/Averages/textF.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        int sum = 0;
        while ((st = br.readLine()) != null)

            // Print the string

            System.out.println("The numbers are: "+st);
//            sum += Integer.parseInt(st);
        System.out.println(sum);
    }
}
