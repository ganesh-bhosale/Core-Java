package oops.wrapperclasses;
// Conversion of String into other data types
public class WC04 {
    public static void main(String [] args){

        String str1 = "32673";
        int intstr1 = Integer.parseInt(str1);
        System.out.println("String -> int : "+intstr1);

        String str2 = "9773.233";
        double doublestr2 = Double.parseDouble(str2);
        System.out.println("Double -> double : "+doublestr2);

        String str4 = "True";
        boolean boolstr = Boolean.parseBoolean(str4);
        System.out.println("Boolean -> String : "+boolstr);

        String str3 = "k";
        char charstr3 = str1.charAt(0);
        System.out.println("String -> char : "+charstr3);

        float f = 24.4f;
        byte b = 23;
        int i = (int)f;
        System.out.println(i);

        String strarray = "Convert this string to array of characters!";
        char [] chararray = strarray.toCharArray();
        for(char ch : chararray){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}
