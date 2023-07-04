package oops.encapsulation.police;

public class cop {

        private String gun;
        int shots;

        public String getGun(){
            return gun;
        }

        public void setGun(String gun) {
            this.gun = gun;
        }

        protected void CanIShoot() {
            System.out.println("Yes you can shoot!");
        }

}
