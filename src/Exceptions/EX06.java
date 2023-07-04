package Exceptions;

public class EX06 {
    public static void main(String [] args){
        // NullPointer Exception

        try{
            String str = null;    // null value
            System.out.println(str.charAt(0));
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception..");
            e.printStackTrace();
        }


    }
}
