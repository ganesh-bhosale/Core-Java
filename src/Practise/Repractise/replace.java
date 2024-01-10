package Practise.Repractise;

public class replace extends ReverseCodes{
    public static void main(String [] args){
        String str = "Hi&9234 8Th98*683e89r,3929Ia3239mDon&*#*";
        System.out.println(str);

        String str1 = str.replaceAll("[^a-zA-Z, ]", "");
        System.out.println(str1);
        reverseString2(str1);
        reverseString3(str1);
    }

    public static void reverseString2(String str){
        char [] ch = str.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev = rev + ch[i];
        }
        System.out.println("Subclass");
        System.out.println("ReverseString2 : "+rev);
    }
}
