package Collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List02 {
    public static void main(String [] args){

        Collection<Integer> intList = new ArrayList<>();

        intList.add(452);
        intList.add(132);
        System.out.println(intList);

        intList.add(392);
        intList.add(244);

        Iterator iterator = intList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        intList.remove(244);
        for(Integer i : intList){
            System.out.print(i+" ");
        }
    }
}
