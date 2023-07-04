package oops.inheritance.MultiLevel;

public class Vehicle {

    int speed;

    Vehicle (int speed){
        this.speed = speed;
    }

    void topSpeed(){
        System.out.println("Top speed of car is "+ this.speed+" KMph");
    }
}
