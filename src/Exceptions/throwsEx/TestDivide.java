package Exceptions.throwsEx;

public class TestDivide {
    public static void main(String [] args){
        Divide d = new Divide();
        try{
            d.divide(45,0);
        }
        catch (DivideByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}

class DivideByZeroException extends Exception{
    public DivideByZeroException(String message){
        super(message);
    }
}

class Divide{
    public void divide(double numerator, double denominator) throws DivideByZeroException{
        if (denominator == 0){
            throw new DivideByZeroException("Can not divide by zero");
        }
        double result = numerator/denominator;
        System.out.println("Result : "+result);

    }
}
