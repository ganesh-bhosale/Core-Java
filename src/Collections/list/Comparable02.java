// Comparable interface is used to define the natural ordering of a class.
// A class that implements the Comparable interface must implement the compareTo() method,
// which compares the object with another object of the same class and returns an integer that indicates the relative order of the two objects.
package Collections.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparable02 {
    public static void main(String [] args){

        // Create a object of Persons
        Persons p1 = new Persons("John", 35);
        Persons p2 = new Persons("Nick", 28);
        Persons p3 = new Persons("Murphy",48);

        ArrayList<Persons> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        System.out.println(persons);

        // Sorting persons arraylist as Comparable interface is implemented by Persons class
        Collections.sort(persons);
        System.out.println(persons);

    }
}

class Persons implements Comparable<Persons>{
    private String name;
    private Integer age;

    public Persons(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Persons o) {
        return Integer.compare(this.age, o.age);
    }
}
