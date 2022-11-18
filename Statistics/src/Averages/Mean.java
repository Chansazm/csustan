package Averages;

public class Mean {




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

    public static void main(String[] args) {
        double[] a = {2.0, 1.1 ,3.3, 4.0, 5.5 ,6.0 ,7.0, 8.5, 9.0 ,10.0 ,11.0, 12.3, 13.0, 14.0 ,15.5, 16.1, 17.0, 18.0 ,19.2, 20.0};

       double TheMean = meanCalculation(a);
        System.out.println(TheMean);
    }

}
//
//    read a file of numbers, and do some elementary statistical calculations.
//        •	Calculate the mean
//        Your program should prompt the user for a filename, read data from the file, and use java methods to do the calculations.
//        See the sample program interaction below . . .

