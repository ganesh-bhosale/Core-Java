package Practise;

import java.util.Scanner;

// Java If-Else code to decide & print if the number is weird or not.
public class Practise01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2==0){
            if(n<=20){
                if(n>=2 && n<=5){
                    System.out.println("Not Weird");
                }
                else if (n>=6 && n<=20) {
                    System.out.println("Weird");
                }
            }
            else{
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }
}
