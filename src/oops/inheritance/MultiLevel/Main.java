package oops.inheritance.MultiLevel;

public class Main {
    public static void main(String [] args){

        Tesla tesla = new Tesla(150);
        tesla.topSpeed();
        
        Car car = new Car(250, "IC Engine", "Sport", 3);
        car.CarSpecification();
    }
}
