package Practise.InterviewCodes;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = sc.nextFloat();

        System.out.println("Enter second number");
        float b = sc.nextFloat();

        System.out.println("Enter third number");
        double c = sc.nextDouble();

        if(a>b && a>c){
            System.out.printf("First Number %f is the largest", a);
        } else if (b>a && b>c) {
            System.out.printf("Second Number %f is the largest ", b);
        }
        else{
            System.out.printf("third number %f is the largest", c);
        }

        double largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("\nLargest : "+largest);

    }
}
