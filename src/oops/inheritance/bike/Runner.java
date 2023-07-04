package oops.inheritance.bike;

public class Runner {
    public static void main(String [] args){

        MountainBike mb = new MountainBike(5, 90, "25 HP");
        System.out.println(mb.toString());

        RacingBike rcb = new RacingBike(6, 250, 7000);
        rcb.setCompanyEngine("Apache", "250 CC");
        System.out.println(rcb.toString());
        rcb.printDetails();

    }
}
