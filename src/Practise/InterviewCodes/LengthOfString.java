package Practise.InterviewCodes;

public class LengthOfString {
    public static void main(String[] args){
        String str = "Thread Safety";
        System.out.println("String length by Length Function: "+str.length());
        int count = 0;

        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println("String Length - "+count);
    }
}
