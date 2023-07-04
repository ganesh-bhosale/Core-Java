package JavaBasics;

public class Strings {
    public static void main(String [] args) {

        // String Functions
        System.out.println("String Functions");
        String str = "The Testing Academy";
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,9));
        System.out.println(str.indexOf("A"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.lastIndexOf('T'));
        System.out.println(str.contains("Academy"));
        System.out.println(str.contains("Ganesh"));
        System.out.println(str.concat(" classes by Pramod Dutta!"));

        System.out.println("--------------------");

        // String Equal Opeations
        System.out.println("String Equal Operation Check");
        String s1 = "Test String Equal Functions";        // Stored in Pool Area
        String s2 = "Test String Equal Functions";
        System.out.println(s1==s2);

        String s3 = new String("Test String Equal Functions");     // Stored in Heap Area
        System.out.println(s1==s3);    // Compares the string referances
        System.out.println(s1.equals(s3));  // Compares String values/sequence of characters
        System.out.println(s1.equals(s2));

        String s4 = "test string EQUAL functions";
        System.out.println(s1==s4);
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
        String s5 = "Functions Test String Equal";
        System.out.println(s1.compareTo(s5));

        System.out.println("-----------");


        // String Join Operations
        System.out.println("Test different String Join reference");
        String str1 = "Hello";
        String str2 = " Guys!";
        String str3 = "Hello Guys!";

        String str4 = str1.concat(str2);
        String str5 = "Hello".concat(" Guys!");

        System.out.println(str3==str4);
        System.out.println(str3==str5);

        String str6 = str1=str2;
        String str7 = "Hello" + " Guys!";

        System.out.println(str3==str6);
        System.out.println(str3==str7);



    }
}
