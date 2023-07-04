package oops.inheritance.bike;

public class RacingBike extends Bike {

    int rpm;
    Boolean isABS;
    String company;
    String Engine;

     public RacingBike(int gear, int speed, int rpm){
        super(gear, speed);
        this.rpm = rpm;
    }


    public void setIsABS(boolean isABS){
         this.isABS = isABS;
    }

    public void setCompanyEngine(String company, String engine){
         this.company = company;
         this.Engine = engine;
    }

    public String toString(){
         return (super.toString()+" with running at "+this.rpm+" rpm.");
    }

    public void printDetails(){
        System.out.printf("Racing Bike is of %s with engine capacity %s", this.company,this.Engine);
    }




}
