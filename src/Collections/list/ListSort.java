// Different methods of Collections class for working with collections
package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String [] args){
        ArrayList<Integer> num = new ArrayList<>();

        num.add(5528);
        num.add(922);
        num.add(232);
        num.add(3,481);
        num.add(352);

        System.out.println(num);

        // Sorting the num list
        Collections.sort(num);
        System.out.println(num);

        List<String> birds = new ArrayList<>();
        birds.add("Seagull");
        birds.add("peagun");
        birds.add("crow");
        birds.set(2,"Sparrow");
        birds.add("eagle");

        System.out.println(birds);

        Collections.sort(birds);
        System.out.println(birds);
    }
}
