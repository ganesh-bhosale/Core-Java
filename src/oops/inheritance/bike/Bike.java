// Java program to illustrate the concept of Inheritance

package oops.inheritance.bike;
// Base Class
public class Bike {

    // Bike has two field
    public int gear;
    public int speed;

    // Bike Constructor
    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    // Bike has three methods
    public void applyBrake(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }

    // toString() method to print info of Bike
    public String toString(){
        return ("No of gears are "+this.gear+"\n"+"Speed of Bicycle is "+this.speed+ " kmph");
    }

}
