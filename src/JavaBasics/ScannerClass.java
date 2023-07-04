package JavaBasics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String [] args){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter your Company");
        String company = sc.nextLine();

        System.out.println("Enter your career level");
        int lvl = sc.nextInt();

        System.out.println("Enter you experience");
        float exp = sc.nextFloat();

        System.out.println("Enter your salary Expectation");
        double sal = sc.nextDouble();

        System.out.println(company);
        System.out.println(lvl);
        System.out.println(exp);
        System.out.println(sal);
        sc.close();

    }
}
