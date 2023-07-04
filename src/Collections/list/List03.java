package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class List03 {
    public static void main(String [] args){

        ArrayList list = new ArrayList();

        list.add("Toyota");
        list.add(56);
        list.add(56);
        System.out.println(list);

        list.set(2, "Ford");
        list.add(98);
        list.set(3,98);

        for(Object i : list){
            System.out.print(i+" ");
        }
        System.out.println();

        list.add(4, "Mustang");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
