package Exceptions;
// Java program to demonstrate Exception is thrown
public class EX04 {

    static int divideByZero(int a, int b){
        // this statement will cause Arithemetic Exception (/ by zero)
        int i = a/b;
        return i;
    }

    static int computeDivision(int a, int b){
        int res = 0;

        // try catch block to check for exception
        try{
            res = divideByZero(a,b);
        }
        catch (NumberFormatException e){
            System.out.println("Number Format exception is occurred");
        }
        return res;
    }

    public static void main(String [] args){
        int a = 1;
        int b = 0;

        try{
            int i = computeDivision(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
