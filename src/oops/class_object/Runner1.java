package oops.class_object;

import oops.class_object.Student;

public class Runner1 {
    public static void main(String [] args) {

        Student std = new Student();
        std.basicDetails("Ganesh", 25, 914749242);
        std.address("Pune", "Maharashtra","India");

        Student std2 = new Student("Ganesh", "Accenture");
    }
}
