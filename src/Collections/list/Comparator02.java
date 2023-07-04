package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator02 {
    public static void main(String [] args){

        ArrayList<Car> car = new ArrayList<>();

        car.add(new Car("Ferrari",350,80000.55));
        car.add(new Car("Bugati",430,95234.13));
        car.add(new Car("Aston Martin", 389,67028.24));
        System.out.println("Original List ->>\n"+car);

        // Sort By Brand using Comparator Interface
        Collections.sort(car, new sortByBrand());
        System.out.println("Sorted by Brand ->>\n"+car);

        // Sort by topSpeed using Comparator Interface
        Collections.sort(car, new sortByTopSpeed());
        System.out.println("Sorted by topSpeed ->>\n"+car);

        // Sort by price using Comparator Interface
        Collections.sort(car, new sortByPrice());
        System.out.println("Sorted by Price ->>\n"+car);
    }
}

class Car{
    private String brand;
    private Integer topSpeed;
    private Double price;

    public Car(String brand, Integer topSpeed, Double price){
        this.brand = brand;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public Integer getTopSpeed(){
        return topSpeed;
    }

    public Double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                '}';
    }
}
class sortByBrand implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2){
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
class sortByTopSpeed implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getTopSpeed(), o2.getTopSpeed());
    }
}

class sortByPrice implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}


