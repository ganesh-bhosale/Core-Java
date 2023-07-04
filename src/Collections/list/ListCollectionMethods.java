package Collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListCollectionMethods {
    public static void main(String [] args){
        // Different method of Collection class;

        ArrayList<Object> list = new ArrayList<>();

        list.add(78);
        list.add("Emosky");
        list.add(99.99);
        list.add('G');
        list.add("Wingify");
        list.add('G');
        System.out.println(list);

        // Randomly permutes the order of elements in list
        Collections.shuffle(list);
        System.out.println(list);

        // replaceAll - Replaces all occurrences of one specified value in a list with another specified value.
        Collections.replaceAll(list,'G', "Ganesh");
        System.out.println(list);

        ArrayList<Double> num = new ArrayList<>();
        num.add(977.22);
        num.add(133.987);
        num.add(32.1);

        // copy() - Copies all of the elements from one list to another.
        Collections.copy(list, num);
        System.out.println(list);

        // binarySearch() - va that allows you to perform a binary search on a sorted list

        int index = Collections.binarySearch(num, 32.1);
        System.out.println(index);

        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));

        list.set(0, "Emosky");
        System.out.println(list);
        System.out.println(Collections.frequency(list,"Emosky"));
    }
}
