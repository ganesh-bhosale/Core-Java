package oops.polymorphism.methodOverloading;

public class DataTypes {

    void dataType(byte i){
        System.out.println(i+ " is a byte");
    }

    void dataType(int i){
        System.out.println(i+ " is an integer");
    }

    void dataType(float i){
        System.out.println(i+ " is a float");
    }

    void dataType(double i){
        System.out.println(i+ " is a double");
    }

    void dataType(long i){
        System.out.println(i+" is a long");
    }

    void dataType(String i){
        System.out.println(i+ " is a String");
    }

    void dataType(char i){
        System.out.println(i+" is a character");
    }
}
