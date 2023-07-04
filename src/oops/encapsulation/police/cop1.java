package oops.encapsulation.police;

public class cop1 {
    public static void main(String [] args){
        cop c2 = new cop();

        c2.setGun("AK47");
        System.out.println(c2.getGun());
        c2.CanIShoot();
    }
}

