package JavaBasics;

public class StaticMethod {
    public static void main(String [] args){

        // Call method from outside Main method within same class
        show();

    }

    // Method need to be static to be called in same class inside Main method.
    public static void show(){
        System.out.println("Printed from another static method outside main method");
    }
}
