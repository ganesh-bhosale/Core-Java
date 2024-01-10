package Practise.InterviewCodes;

import java.util.HashSet;

public class DuplicateInArray {
    // Code to find the duplicate elements in an Array
    public static void main(String[] args){
        // Method 1 - Using iteration
        String [] skills = {"Selenium", "maven", "Java", "RestAssured", "Java", "API", "selenium", "API", "Java"};
        boolean isDuplicate = false;

        for(int i=0;i<skills.length;i++){
            for(int j=i+1; j< skills.length;j++){
                if(skills[i]==skills[j]){
                    isDuplicate = true;
                    System.out.print(skills[i]+", ");
                }
            }
            }
        if(isDuplicate==false){
            System.out.println("No duplicate found");
        }

        // Method 2 - Using HashSet

        int [] numArray = {34,10,24,64,2,10,32,2,96,64};
        HashSet<Integer> num = new HashSet<Integer>();
        boolean isDuplicate1 = false;

        System.out.println();
        for(int i : numArray){
            if(num.add(i)==false){            // If duplicate element is added in HashSet it returns false value
                System.out.print(i+" ");
                isDuplicate1 =true;
            }
            }
        if(isDuplicate1==false){
            System.out.println("No Duplicate Number found");
        }
    }
}
