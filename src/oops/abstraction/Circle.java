package oops.abstraction;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){

        // calling Shape constructor
        super(color);
        this.radius = radius;
        System.out.println("Circle Constructor is called");
    }

    @Override
    double area(){
        return Math.round(Math.PI*Math.pow(radius,2));
    }

    @Override
    public String toString(){
        return "Circle Color is " + super.getColor()
                + " and area is "+ area();
    }

}
