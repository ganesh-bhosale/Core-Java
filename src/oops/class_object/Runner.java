package oops.class_object;

import oops.class_object.Student;

public class Runner {
    public static void main(String [] args){

        Student s1 = new Student();
        s1.name = "Ganesh";
        System.out.println(s1.name);
        s1.ClassMethod();
        Student s2 = new Student("Emosky");
    }
}
