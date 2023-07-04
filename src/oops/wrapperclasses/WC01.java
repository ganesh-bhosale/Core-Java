package oops.wrapperclasses;

import java.sql.SQLOutput;

// Java program to explain String Conversions
public class WC01 {
    public static void main(String [] args){
        // Using toString() method of Wrapper Class

        int a = 3232;
        int b = 143;

        // converting integers to string using toString() method
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        // Printing the above string that holds integer
        System.out.println("Value of int a in String : "+ str1);
        System.out.println("Value of int b in String : "+str2);

        byte c = 25;
        String str3 = Byte.toString(c);
        System.out.println("byte String : "+str3);

        float d = 34.2f;
        String str4 = Float.toString(d);
        System.out.println("float String : "+str4);

        double e = 23432.23;
        String str5 = Double.toString(e);
        System.out.println("double String : "+str5);

        long f = 639481734;
        String str6 = Long.toString(f);
        System.out.println("long String : "+str6);

        char g = 'G';
        String str7 = Character.toString(g);
        System.out.println("char String : "+str7 );

        // Wrapper Class/objects to String Conversion

        Integer intobj = 983;
        String strint = Integer.toString(intobj);
        System.out.println("Interger ojb - String : "+strint);

        String test = "teststring";
        int testint = 456;
        System.out.println(test+strint);
        System.out.println(testint+strint);

        Character charobj = 'Z';
        String strchar = Character.toString(charobj);
        System.out.println("Character obj - String : "+strchar);
    }
}
