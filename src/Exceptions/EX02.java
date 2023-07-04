package Exceptions;

public class EX02 {
    public static void main(String [] args){

        try{
            String str = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10/a;
            System.out.println(a);
            System.out.println(b);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Printed after Try Catch block is executed");
    }
}
