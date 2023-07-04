package oops.interfaces;

public class Ferrari implements Supercar{

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    public void applyBrakes(int drecrement){
        speed = speed - drecrement;
    }

    public void printState(){
        System.out.println(this.getClass().getSimpleName()+ " Speed : "+speed+" Gear: "+gear);
    }
}

