package Collections.list;

import java.util.LinkedList;

public class List05 {
    public static void main(String [] args){
        // LinkedList Example

        LinkedList list = new LinkedList();
        list.add(1);
        list.add("Emosky");
        list.add(45);
        list.set(2,78);
        list.add(3,"Slayer");
        System.out.println(list);

        for(Object i: list){
            System.out.print(i+" ");
        }

    }
}
