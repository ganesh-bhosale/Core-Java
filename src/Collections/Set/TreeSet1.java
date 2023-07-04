package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String [] args){
        // TreeSet Example - values are stored in sorted order by Ascending/Natural order

        // Creating TreeSet Object
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(9827);
        treeSet.add(1238);
        treeSet.add(38);
        treeSet.add(724);
        treeSet.add(2397);

        // Print the elements of treeSet
        System.out.println("TreeSet: "+treeSet);

        treeSet.remove(1238);

        for(Integer i : treeSet){
            System.out.print(i+" ");
        }
    }
}
