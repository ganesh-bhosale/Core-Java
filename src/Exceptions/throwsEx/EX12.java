package Exceptions.throwsEx;

public class EX12 {
    public static void main(String [] args) throws Exception {
        divide(20,5);
    }

    public static void divide(int a, int b) throws Exception{
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = a/b;
        System.out.println("Result is : "+result );
    }
}
