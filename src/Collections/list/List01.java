package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {
    public static void main(String [] args){

        // ArrayList
        List<String> stringlist = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        stringlist.add("SQL");
        stringlist.add("Python");
        stringlist.add(2,"Kotlin");

        System.out.println(stringlist);

        stringlist.set(2,"Ruby");
        System.out.println(stringlist);

        stringlist.add(3,"HTML");
        stringlist.remove("Ruby");
        stringlist.add("JavaScript");

        // Iterate over the ArrayList

        // Using for loop
        for(int i=0; i<stringlist.size(); i++){
            System.out.print(stringlist.get(i)+" ");
        }
        System.out.println();

        stringlist.add(4,".net");

        // using advanced for loop
        for(Object i : stringlist){
            System.out.print(i+" ");
        }

        stringlist.add("Java");
        stringlist.add(4,"C#");

        // using Iterator
        Iterator<String> iterator = stringlist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
