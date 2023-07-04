package oops.polymorphism.methodOverloading;

public class Main {
    public static void main(String [] args){


        System.out.println("Method OverLoading for Data types");
        DataTypes dt = new DataTypes();
        dt.dataType(23);
        dt.dataType(123.4);
        dt.dataType("Emksoy");
        dt.dataType(12123123);
        dt.dataType('Z');
        dt.dataType(1.4f);
        dt.dataType((byte)5);

        System.out.println("Method Overloading for Math Calculator");
        MathCalculator math = new MathCalculator();
        math.mathCal(4,8);
        math.mathCal(234,4.3);
        math.mathCal(213,37,202);
        math.mathCal(44.2,2.4);
        math.mathCal(37,12,49,15);
        math.mathCal("Test");

    }
}
