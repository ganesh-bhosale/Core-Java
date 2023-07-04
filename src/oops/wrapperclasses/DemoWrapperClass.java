package oops.wrapperclasses;

public class DemoWrapperClass {
    public static void main(String [] args){
        /* AutoBoxing */

        byte a = 1;
        Byte byteobj = a;

        // int data type
        int c = 10;

        // wrapping around integer object
        Integer intobj = c;

        float e = 5.6f;
        Float floatobj = e;

        double g = 250.6;
        Double doubleobj = g;

        char i = 'k';
        Character charobj = i;

        // Printing the values from object

        System.out.println("Values of wrapper objects (printing as objects)");
        System.out.println("Byte Object : "+byteobj);
        System.out.println("Integer Object : "+intobj);
        System.out.println("Float Object : "+floatobj);
        System.out.println("Double Object : "+doubleobj);
        System.out.println("Char Obj : "+charobj);
        System.out.println();

        /* Unboxing */
        // objects to data types (retrieving data types from objects) unwrapping objects to primitive data types

        byte  bv = byteobj;
        int iv = intobj;
        double dv = doubleobj;
        float fv = floatobj;
        char cv = charobj;

        // Printing the values from data types
        System.out.println("unwrapped values (printing as data types)");
        System.out.println("byte value : "+bv);
        System.out.println("float values : "+fv);
        System.out.println("double value : "+dv);
        System.out.println("Integer value : "+iv);
        System.out.println("Character value : "+cv);
    }
}
