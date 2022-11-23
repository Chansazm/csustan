package Trials;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVReader {


    public static void main(String[] args) throws IOException {
        String path = "/Users/chansa/Downloads/csustan/Statistics/src/Averages/tex.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        int count = 0;
        while ((line = br.readLine()) != null){
            System.out.println(line);
            count++;


        }
        System.out.println(count);
    }
}
