package oops.interfaces;

public class Bugati implements Supercar{

    int speed;
    int gear;

    Bugati(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int drecrement){
        speed = speed - drecrement;
    }

    public void printStates(){
        System.out.println(this.getClass().getSimpleName()+" Speed : "+speed+" Gear: "+gear);
    }
}
