package Practise.InterviewCodes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseTheString {
    // Code to reverse the string by words
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        reverseByCharAt(str);
        reverseByStringBuilder(str);
    }

    public static void reverseByCharAt(String str){
        System.out.println("Approach -1");
        String [] words = str.split(" ");
        String reversedString = "";

        for(String w:words){
            String reversedWord = "";
            for(int i=w.length()-1;i>=0;i--){
                reversedWord = reversedWord + w.charAt(i);
            }
            reversedString = reversedString + reversedWord+ " ";
        }
        System.out.println(reversedString);
    }

    public static void reverseByStringBuilder(String str){
        System.out.println("Approach -2");
        String words[] = str.split("\\s");
        String reversedString = "";
        for(String w: words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reversedString = reversedString+sb.toString()+ " ";
        }

        System.out.println(reversedString);
    }
}
