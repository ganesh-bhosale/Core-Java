package Practise.InterviewCodes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Method 1 - using loop
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num % 10;
            num = num/10;
        }

        // Method 2 - Using StringBuffer
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev= sb.reverse();

        // Method 3 - Using StringBuilder

//        StringBuilder sb  = new StringBuilder();
//        sb.append(num);
//        StringBuilder rev = sb.reverse();

        System.out.println("Reversed Number : "+rev);
    }
}
