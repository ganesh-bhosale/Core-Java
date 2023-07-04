package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable01 {
    public static void main(String [] args){

        List<Integer> marks = new ArrayList<>();
        marks.add(98);
        marks.add(87);
        marks.add(91);

        ATBStudent s1 = new ATBStudent(45,"Razor","ATB");
        ATBStudent s2 = new ATBStudent(13, "Monster","MTB");
        ATBStudent s3 = new ATBStudent(34,"Envy","SQL");

        ArrayList<ATBStudent> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get(2));

        ATBStudent student = students.get(1);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getCourse());

        // Collection.sort can be used after implementing Comparable Interface
        Collections.sort(students);
        System.out.println(students);

    }
}

class ATBStudent implements Comparable<ATBStudent>{
    private int id;
    private String name;
    private String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public ATBStudent(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "ATBStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(ATBStudent o) {
        return Integer.compare(this.id, o.id);
    }
}

