package oops.class_object;

import java.sql.SQLOutput;

public class Student {

    String name;
    int age;
    long phoneno;
    String company;
    String city;
    String state;
    String country;

    Student(){
        System.out.println("--Default constructor is called--");
    }

    Student(String name1){
        this.name = name1;
        System.out.println("--Parametrized Constructor is called--");
        System.out.println("Name is set to - " + this.name);
        System.out.println("Name is set to - "+ name1);
    }

    Student(String name, String company){
        this.name = name;
        this.company = company;
        System.out.println("Hi I am "+this.name+" from "+this.company);
    }

    void ClassMethod(){
        System.out.println("--I am called from another class");
    }

    void basicDetails(String name, int age, long phoneno){
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
        System.out.println("--Calling basicDetails Method--");
        System.out.println("Name - "+this.name+"\nAge - "+this.age+"\nPhoneNo - "+this.phoneno);
    }

    void address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
        System.out.println("--Calling address Method--");
        System.out.println("Address\nCity - "+this.city+"\nstate - "+this.state+"\ncountry - "+this
                .country);

    }
}
