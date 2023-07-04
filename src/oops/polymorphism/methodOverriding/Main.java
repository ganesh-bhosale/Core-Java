package oops.polymorphism.methodOverriding;

public class Main {

    public static void main(String [] args){

        Shape shape = new Shape();
        shape.getArea();

        shape = new Circle(6);
        shape.getArea();
        System.out.println(shape.getArea());

        Shape shape1 = new Rectangle(5,7);
        shape1.getArea();
        System.out.println(shape1.getArea());


    }
}
