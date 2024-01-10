package Practise.Repractise;

import java.util.Scanner;

public class Practise02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        double d = sc.nextDouble();
//        sc.nextLine();
//        String str = sc.nextLine();
//        sc.close();
//
//        System.out.println("String: "+str);
//        System.out.println("Double: "+d);
//        System.out.println("Int: "+n);

        // Reverse String
        String str1 = "This is code to reverse a String";
        String rev = "";
        char ch[] = str1.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            rev = rev + ch[i];
        }

        System.out.println(rev);

        // Reverse a number
        int num = 3257;
        int rev_num = 0;

        while(num>0){
            int temp = num % 10;
            rev_num = rev_num*10 + temp;
            num = num/10;
        }
        System.out.println(rev_num);
    }
}
