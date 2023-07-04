package Exceptions;

public class EX07 {
    public static void main(String [] args){
        // StringIndexOutOfBoundsException

        try{
            String a = "This is like chipping";   // length is 21
            System.out.println(a.length());
            char c = a.charAt(25);
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
            e.printStackTrace();
        }
    }
}
