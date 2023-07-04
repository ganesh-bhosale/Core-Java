package oops.encapsulation.thief;

import oops.encapsulation.police.cop;

public class thief {
    public static void main(String [] args) {
        cop c1 = new cop();

        c1.setGun("SCAR-L");
        System.out.println(c1.getGun());

        // c1.CanIShoot();


    }
}
