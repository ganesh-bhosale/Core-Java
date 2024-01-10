package Practise.InterviewCodes;

public class FibonacciSeries {
    public static void main(String [] args){

        // Code to Generate Fibonacci Series - Next number is sum of two preceding numbers

        int n1 = 3;
        int n2 = 5;
        int sum = 0;

        for(int i=2; i<10;i++){
            sum = n1 + n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }
    }

}
