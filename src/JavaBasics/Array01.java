package JavaBasics;

public class Array01 {
    public static void main(String [] args) {
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};
        int [] a3 = a1;

        System.out.println(a1==a2);
        System.out.println(a1==a3);
        System.out.println(a2==a3);
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));
        System.out.println(a1.equals(a3));
    }
}
