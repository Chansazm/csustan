
package Trials;
import java.util.StringTokenizer;
import java.io.*;



public class Token {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("/Users/chansa/Downloads/csustan/Statistics/src/Averages/textF.txt");
        BufferedReader br = new BufferedReader(file);

        String st = br.readLine();
        int sum = 0;
        int numbers = 0;

        while ((st = br.readLine()) != null){
            StringTokenizer stn = new StringTokenizer(st);
            String rn = stn.nextToken();
           numbers = Integer.parseInt(stn.nextToken());
           sum += numbers;
        }
        System.out.println(sum);
    }

}
