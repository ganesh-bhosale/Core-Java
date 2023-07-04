package oops.inheritance.MultiLevel;

import java.sql.SQLOutput;

public class Car extends Vehicle {

    String engineType;
    String model;
    int seat;
    Car(int speed){
        super(speed);
    }
    public Car (int speed, String engineType, String model, int seat){
        super(speed);
        this.engineType = engineType;
        this.model = model;
        this.seat = seat;
    }
    void CarSpecification(){
        System.out.println("Car Engine : "+ this.engineType);
        System.out.println("Model :"+this.model);
        System.out.println("Seats "+this.seat);
    }
}
