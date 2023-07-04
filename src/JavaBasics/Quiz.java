package JavaBasics;

import java.util.Scanner;

public class Quiz {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a, b & c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        double result = Math.cbrt(Math.pow(a,2)+ Math.pow(b,2)- Math.abs(c));
        System.out.println(Math.round(result));
    }
}
