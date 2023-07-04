// Java Comparator is an interface used to define a custom ordering of objects that are not comparable using the Comparable interface.
// While the Comparable interface is used to define the natural ordering of a class,
// the Comparator interface is used to define a specific ordering of objects based on some custom criteria.

package Collections.list;

import java.util.*;

public class Comparator01 {
    public static void main(String [] args){
        // Create a list of persons
        List<Person> persons = new LinkedList<>();

        persons.add(new Person("Gerald", 35, 43322));
        persons.add(new Person("Albie", 25,98323));
        persons.add(new Person("Marcus", 29,13341));

        System.out.println(persons);

        // Sort by Name using Comparator Interface
        Collections.sort(persons, new sortByName());
        System.out.println(persons);

        // Sort by Age using Comparator Interface
        Collections.sort(persons, new sortByAge());
        System.out.println(persons);

        // Sort by Phoneno using Comparator Interface
        Collections.sort(persons, new sortByPhoneno());
        System.out.println(persons);
    }
}

class Person {
    private String name;
    private int age;
    private int phoneno;

    public Person(String name, int age, int phoneno){
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getPhoneno(){
        return phoneno;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneno=" + phoneno +
                '}';
    }
}

class sortByName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class sortByAge implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class sortByPhoneno implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getPhoneno(), o2.getPhoneno());
    }
}

