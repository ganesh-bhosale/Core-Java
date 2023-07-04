package Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String [] args){
        // Set - HashSet example - Element stored randomly

        Set<String> set = new HashSet<>();

        set.add("Red");
        set.add("Voilet");
        set.add("Green");
        set.add("Blue");
        set.add("Black");
        set.add(null);

        System.out.println(set);

        for(String i : set){
            System.out.print(i+" ");
        }
    }
}
