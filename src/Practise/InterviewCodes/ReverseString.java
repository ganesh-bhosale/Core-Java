package Practise.InterviewCodes;

import java.util.Scanner;

public class ReverseString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String rev = "";

        // Method 1 - using (+) concatenation operator & charAt() function
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        // Method 2 - using character array
//        char a[] = str.toCharArray();
//
//        for(int i=a.length-1 ; i>=0; i--){
//            rev = rev + a[i];
//        }

        // Method 3 - using StringBuffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println("Reversed String : "+ rev);
    }
}
