package Practise.InterviewCodes;

public class RemoveSpecialChars {
    public static void main(String [] args){
        // Code to remove special or junk characters
        String str = "Th^*11(*_e( &78*&Pa(&&*!@!@la##ce9 O&^^&f(& Illu*^&*)sio&(&n";
        System.out.println("Original - "+str);

        String str1 = str.replaceAll("[^a-zA-Z ]", "");
        System.out.println("Replaced - "+str1);

        String str2 = str.replaceAll("[a-zA-Z ]", "");
        System.out.println("Special Char/Junk String - "+str2);

        String str3 = str.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(str3);

        String str4 = str.replaceAll("[^0-9]", "");
        System.out.println(str4);


    }
}
