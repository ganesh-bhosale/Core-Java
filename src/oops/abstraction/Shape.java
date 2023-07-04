// Program to illustrate the Concept of Abstraction

package oops.abstraction;

// abstract class with keyword 'abstract'
public abstract class Shape {
    String color;

    // abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color){
        System.out.println("Shape constructor is called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor(){
        return color;
    }
}
