package Practise.InterviewCodes;

public class CountWordInString {
    // Code to count the words in a string
    public static void main(String [] args){
        String str = "String is immutable in nature";
        System.out.println(countWords("No of words : "+str));

        String [] words = str.split(" ");
        int count = 0;
        for(String w : words){
            count++;
        }
        System.out.println("Word Count: "+count);
    }

    public static int countWords(String str){
        int count= 1;
        for(int i=0; i<=str.length()-1;i++){
            if(str.charAt(i)== ' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }

}
