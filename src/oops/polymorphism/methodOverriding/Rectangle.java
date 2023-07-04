package oops.polymorphism.methodOverriding;

public class Rectangle extends Shape{

    int length;
    int breadth;

    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public double getArea(){
        System.out.println("Rectangle area is called");
        return this.length * this.breadth;
    }
}
