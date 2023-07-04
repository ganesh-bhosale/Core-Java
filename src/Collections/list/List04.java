package Collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List04 {
    public static void main(String [] args){
        List fightPlanes = new ArrayList();

        fightPlanes.add("Sukhoi");
        fightPlanes.add("F22-Raptor");
        fightPlanes.add("J20");
        fightPlanes.add(3,"Raphael");
        System.out.println(fightPlanes);

        ArrayList<String> cplanes = new ArrayList<>();
        cplanes.add("Boeing");
        cplanes.add("Airbus");
        cplanes.add("Air India");
        System.out.println(cplanes);

        List<String> planes = new ArrayList<>();

        planes.add("Spice Jet");
        planes.add(1,"Emirates");
        System.out.println(planes);

        planes.addAll(fightPlanes);
        System.out.println(planes);

        planes.addAll(2,cplanes);
        System.out.println(planes);
        System.out.println(planes.lastIndexOf("F22-Raptor"));
        System.out.println(planes.indexOf("F16"));
        System.out.println(planes.size());

        // Iterate using list Iterator

        ListIterator lt = planes.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
            lt.add("Tejas");
            // lt.remove();
        }

        System.out.println(planes);
        System.out.println(planes.size());
    }
}
