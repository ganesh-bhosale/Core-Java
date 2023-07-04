package oops.inheritance.bike;

//Derived class
public class MountainBike extends Bike{

    // Mountain Bike subclass and one more field
    public String power;

    // Mountain Bike Constructor
     public MountainBike(int gear, int speed, String power){
         // Invoking Base Class constructor
         super(gear, speed);
         this.power = power;
     }

     // Mountain Bike adds one more method

    public void setPower(String newPower){
         this.power = newPower;
    }

    // overriding toString() method to print more info
    public String toString(){
         return (super.toString()+ "\n Bike Power is "+this.power);
    }
}
