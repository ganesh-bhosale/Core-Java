package oops.polymorphism.methodOverloading;

public class MathCalculator {

    public void mathCal(int a , int b, int c){
        System.out.println("Addition");
        System.out.println("a+b+c= " + (a+b+c));
    }

    public void mathCal(int a, int b){
        System.out.println("Subtraction");
        System.out.println("a-b= "+(a-b));
    }

    public void mathCal(double a, double b){
        System.out.println("Multiplication");
        System.out.println("a*b= "+ (a*b));
    }

    public void mathCal(int a, double b){
        System.out.println("Division");
        System.out.println("a/b= "+ (a/b));
    }

    public void mathCal(int a, int b, int c, int d) {
        System.out.println("Mix Operation");
        System.out.println("(a*b-c)/d= "+ ((a*b-c)/d));
    }

    public void mathCal(String a){
        System.out.println("String, not a valid input for Math Cal");
    }
}
