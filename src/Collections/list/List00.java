package Collections.list;

import java.util.List;

public class List00 {
    public static void main(String [] args){

        List fruits = List.of("Apple","Banana","Strawberry","Orange","Kiwi","Lemon","Watermelon");
        System.out.println(fruits);

        System.out.println(fruits.size());
        System.out.println(fruits.get(2));
        System.out.println(fruits.indexOf("Orange"));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Kiwi"));
    }
}
