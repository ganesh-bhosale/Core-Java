package oops.abstraction;

public class RunnerClass {
    public static void main(String [] args){
        Circle circle = new Circle("Red", 5);
        System.out.println(circle.toString());

        Triangle triangle = new Triangle("Voilet", 15,10);
        System.out.println(triangle.toString());
    }
}
