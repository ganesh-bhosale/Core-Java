package oops.innerclass;

public class Main {
    public static void main(String [] args){

        Car car = new Car("Lamborghauni");
        car.drive();

        Car.Engine engine = car.new Engine("786HP");
        engine.start();
        System.out.println(engine.toString());
    }
}
