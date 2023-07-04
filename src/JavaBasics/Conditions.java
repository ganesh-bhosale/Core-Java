package JavaBasics;

public class Conditions {
    public static void main(String [] args) {
        int a = 45 ;
        int b = 20 ;
        int c = 25 ;

        if( a>b && a>c){
            System.out.println("max is a:"+a);
        } else if ( b>a && b>c) {
            System.out.println("max is b:"+b);
        }else {
            System.out.println("max is C:"+c);
        }
    }
}
