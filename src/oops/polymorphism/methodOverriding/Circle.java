package oops.polymorphism.methodOverriding;

public class Circle extends Shape{

    int radius;

    Circle(int r){
        this.radius = r;
    }

    public double getArea(){
        System.out.println("Circle area is called");
        return 3.14*radius*radius;
    }
}
