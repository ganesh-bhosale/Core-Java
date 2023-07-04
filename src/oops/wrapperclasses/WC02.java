package oops.wrapperclasses;

public class WC02 {
    public static void main(String [] args){
        // String Conversion using valueOf() mthod of String class.

        int iv = 344;
        String str1 = String.valueOf(iv);
        System.out.println("int-String : "+str1);

        byte bv = 13;
        String str2 = String.valueOf(bv);
        System.out.println("byte-String : "+str2);

        double dv = 213.33;
        String str3 = String.valueOf(dv);
        System.out.println("double-String : "+str3);

        char cv = 'G';
        String str4 = String.valueOf(cv);
        System.out.println("char-String : "+cv);

        // String Conversion of wrapper classes

        Integer intobj = 74623;
        String strint = String.valueOf(intobj);
        System.out.println("Integer - String : "+strint);
        System.out.println(strint.concat("-Number is converted to string and then concatenated"));

        Double doubleobj = 923.5234;
        String strdouble = String.valueOf(doubleobj);
        System.out.println("Double obj - String : "+strdouble);

        Character charobj = 'Y';
        String strchar = String.valueOf(charobj);
        System.out.println("Character Obj - String : "+strchar);
    }
}
