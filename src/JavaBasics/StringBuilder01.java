package JavaBasics;

public class StringBuilder01 {
    public static void main(String [] args) {

        StringBuilder sb1 = new StringBuilder("Emosky");
        StringBuilder sb2 = new StringBuilder("Emosky");

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.toString().contentEquals(sb2.toString()));
        System.out.println(sb1.toString().equals(sb2.toString()));

        sb1.append(" Welcome to ATB!");
        System.out.println(sb1);

        sb2.reverse();
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("GaneshB");
        sb3.deleteCharAt(6);
        System.out.println(sb3);

        System.out.println(sb3.indexOf("A"));
        System.out.println(sb3.append(" Bhosale"));
        System.out.println(sb3);
        System.out.println(sb3.reverse());
        System.out.println(sb3.reverse());
        System.out.println(sb3.insert(6, "D"));
        System.out.println(sb3.delete(6,7));
        System.out.println(sb3.length());
        System.out.println(sb3.replace(3,6, "u"));

        StringBuffer sb4 = new StringBuffer("The Testing Academy");
        System.out.println(sb4.length());
        System.out.println(sb4.substring(5,10));
        System.out.println(sb4.reverse());
        System.out.println(sb4.deleteCharAt(1));

    }
}
