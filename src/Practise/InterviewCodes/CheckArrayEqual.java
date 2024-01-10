package Practise.InterviewCodes;

import java.util.Arrays;

public class CheckArrayEqual {
    public static void main(String [] args){
        // Code to check if two arrays are equal

        // Method 1 - using Arrays.equals
        int a[] = {32,2,5,343,54,2324,24};
        int b[] = {32,2,5,343,54,2324,24};

        Boolean status = Arrays.equals(a,b);
        System.out.println(status);

        // Method 2 - Using loop
        boolean status1 = true;
        for(int i=0; i<a.length;i++){
            if(a[i]==b[i]){
                status1 =true;
            }
            else{
                status1 = false;
            }
        }
        if(status1 == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }


    }
}
