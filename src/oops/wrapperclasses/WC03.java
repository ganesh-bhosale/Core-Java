package oops.wrapperclasses;
// String Conversions using StringBuffer class
public class WC03 {
    public static void main(String [] args){

        int i = 8732;

        StringBuffer sb = new StringBuffer();
        sb.append(i);
        System.out.println("int - String: "+sb);

        char ch = 'D';
        StringBuilder sb1 = new StringBuilder();
        sb1.append(ch);
        System.out.println("char - String "+sb1);
    }
}
