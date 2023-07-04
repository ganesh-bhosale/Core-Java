package Exceptions;

public class EX01 {
    public static void main(String [] args){
        // Code which have multiple exceptions

        String str = args[0];     // ArrayIndexOutofBounds Exception
        int a = Integer.parseInt(args[0]);     // NumberFormat Exception
        int b = 10/a;                      // Arithmetic Exception
        System.out.println(a);
        System.out.println(b);
    }
}
