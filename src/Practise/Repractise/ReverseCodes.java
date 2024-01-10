package Practise.Repractise;

import java.util.Scanner;

public class ReverseCodes {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int number = sc.nextInt();
        int number = 89432;
        System.out.println("Number : "+number);
        reverseNumber1(number);
        reverseNumber2(number);

        String str = "Enchanting Earth";
        System.out.println(str);
        reverseString1(str);
        reverseString2(str);
        reverseString3(str);

        String str1 = "Test Automation Framework";
        reverseStringByWord(str1);
    }

    public static void reverseNumber1(int num){
        int rev = 0;

        while(num!=0){
            rev = rev*10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse1 : "+rev);
    }

    public static void reverseNumber2(int num){
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.println("Reverse2 : "+sb);
    }

    public static void reverseString1(String str){
        String rev = "";

        for(int i=0;i<str.length();i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println("ReverseString1 : "+rev);
    }

    public static void reverseString2(String str){
        char [] ch = str.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev = rev + ch[i];
        }
        System.out.println("ReverseString2 : "+rev);
    }

    public static void reverseString3(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("ReverseString3 : "+sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append(str);
        sb1.reverse();
        System.out.println("ReverseString4 : "+sb1);
    }

    public static void reverseStringByWord(String str){
        String [] strArray = str.split(" ");
        StringBuffer sb = new StringBuffer();

        for(int i=0 ; i<strArray.length; i++){
            String rev = "";
            char ch [] = strArray[i].toCharArray();
            for(int j=0; j<ch.length; j++){
                rev = ch[j] + rev ;
            }
            sb.append(rev+ " ");
        }
        System.out.println("Reversed String by words : "+sb);
    }
}
