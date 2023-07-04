package oops.interfaces;

public class Runner {
    public static void main(String [] args){

        Ferrari ferrari = new Ferrari();
        ferrari.changeGear(5);
        ferrari.speedUp(250);
        ferrari.printState();

        ferrari.applyBrakes(61);
        ferrari.printState();

        Bugati bugati = new Bugati(410, 6);
        bugati.printStates();
        bugati.speedUp(33);
        bugati.printStates();
        bugati.applyBrakes(136);
        bugati.changeGear(4);
        bugati.printStates();
    }
}
