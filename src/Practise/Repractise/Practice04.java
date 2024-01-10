package Practise.Repractise;

import java.util.*;

public class Practice04 {
    public static void main(String [] args){
        String str = "Test Automation Framework";

        Set<Character> uniqueChar = new HashSet<>();
        Set<Character> duplicateChar = new HashSet<>();

        char [] ch = str.toCharArray();
        for(char c : ch){
            if(!uniqueChar.add(c)){
                duplicateChar.add(c);
            }
        }

        System.out.println("Unique Char "+uniqueChar);
        System.out.println("Duplicate Char "+duplicateChar);

        Map<Character, Integer> charFreqMap = new HashMap<>();
        char [] ch1 = str.toCharArray();

        for(char c : ch1){
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0)+1);
        }

        System.out.println("Duplicate chars");
        for(Map.Entry<Character, Integer> entry : charFreqMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " - "+ entry.getValue());
            }
        }
    }
}
