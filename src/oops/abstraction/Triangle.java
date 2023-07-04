package oops.abstraction;

import oops.abstraction.Shape;

public class Triangle extends Shape {
    int base;
    int height;

    public Triangle(String color, int base, int height){
        super(color);
        System.out.println("Rectangle");
        this.base = base;
        this.height = height;
    }

    public double area(){
        return ((base*height)/2);
    }

    public String toString(){
        return "Triangle Color is " + super.getColor()
                + " and area is "+ area();
    }
}
