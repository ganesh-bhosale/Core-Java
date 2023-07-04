package Exceptions;

public class EX05 {
    public static void main(String [] args){

        // Arithmetic Exception
        try{
            int a = 30, b = 0;
            int c = a/b;
            System.out.println("Result = "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide a number by zero");
        }
    }
}
