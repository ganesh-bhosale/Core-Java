package oops.inheritance.hasA;


public class Runner {
    public static void main(String [] args) {

        Vehicle v1 = new Vehicle(23, "Tesla");
        Vehicle v2 = new Vehicle(32, "Bugati");

        Driver d1 = new Driver("Emosky", v1);
        Driver d2 = new Driver("Slayer", v2);

        String result1 = d1.showDriverDescription(v1);
        System.out.println(result1);

        String result2 = d2.showDriverDescription(v2);
        System.out.println(result2);
    }
}
