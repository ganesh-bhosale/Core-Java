package Practise.InterviewCodes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInString {
    // Code to find duplicate characters in a String

    public static void main(String [] args){

        String adidas = "Impossible is Nothing";
        char [] ch = adidas.toCharArray();
        boolean isDuplicate = false;

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[i]+",");
                    isDuplicate =true;
                }
            }
        }
        if(isDuplicate==false){
            System.out.println("No Duplicates found");
        }

        // Method 2

        String inputString = "programming";

        // Create a Set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Create a Set to store duplicate characters
        Set<Character> duplicateChars = new HashSet<>();

        // Convert the string to an array of characters
        char[] characters = inputString.toCharArray();

        // Iterate through the characters
        for (char i : characters) {
            // If the character is already in uniqueChars, add it to duplicateChars
            if (!uniqueChars.add(i)) {
                duplicateChars.add(i);
            }
        }

        // Print the duplicate characters
        System.out.println();
        System.out.println("Duplicate characters in the string: " + duplicateChars);


        // Method to find Occurrence of Element
        String nike = "Just Do it, Here to create!";
        int nikeLength = nike.length();

        String char_e = nike.replaceAll("e", "");
        int char_e_length = char_e.length();

        System.out.println("No of e char occurrence - "+(nikeLength-char_e_length));
    }
}
