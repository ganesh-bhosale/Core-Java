package Collections.list;

import java.util.*;

public class ListReverse {
    public static void main(String [] args){
        // Reverse method of Collections class

        List<Integer> num = new LinkedList<>();
        num.add(76);
        num.add(90);
        num.add(232);
        num.add(982);

        System.out.println(num);

        Collections.reverse(num);
        System.out.println(num);

        ArrayList<String> name = new ArrayList<>();
        name.add("Ganesh");
        name.add("Pratik");
        name.add("Ajinkya");
        name.add("Akash");
        name.add(4,"Vishal");
        System.out.println(name);

        Collections.reverse(name);
        System.out.println(name);

        String name1 = name.get(name.indexOf("Pratik"));
        System.out.println(name1);

        char [] ch = name1.toCharArray();

        ArrayList<Character> chars = new ArrayList<>();
        for(Character i : ch){
            chars.add(i);
        }
        System.out.println(chars);

        Collections.reverse(chars);
        System.out.println(chars);

        Iterator iterator = chars.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
