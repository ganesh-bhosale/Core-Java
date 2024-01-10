package Practise.InterviewCodes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        Palindrome pl = new Palindrome();
        pl.NumberPalindrome(num);

        System.out.println("Enter the String");
        String str = sc.next();
        StringPalindrome(str);

    }

    // Method to find Number Palindrome
    public void NumberPalindrome(int num){
        int org_num = num;
        int rev=0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if(rev==org_num){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }

    // Method to find String Palindrome
    public static void StringPalindrome(String str){
        String org_str = str;
        char ch[] = str.toCharArray();
        String rev = "";
        for(int i = ch.length-1; i>=0; i--){
            rev = rev + ch[i];
        }

        if(rev.equals(org_str)){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }

}
