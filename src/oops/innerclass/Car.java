package oops.innerclass;

public class Car {

    String make;

    Car(String make){
        this.make = make;
    }

    void drive(){
        System.out.println("Yes! You can drive the Car");
    }

    public class Engine{

        String horsePower;

        public Engine(String horsePower){
            this.horsePower = horsePower;
        }

        void start(){
            System.out.println("Engine is started!");
        }

        public String toString(){
            return make + " has a "+ horsePower+ " Engine";
        }
    }
}
