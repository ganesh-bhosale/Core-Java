package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String [] args){
        // Linked HashSet example - Elements stored in by order they were Added

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Blueberry");
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Mango");

        Iterator iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
