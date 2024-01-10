package Practise.InterviewCodes;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String [] args){
        // Code to sort the elements of array by Bubble Sort

        int [] a = {33,6,21,45,9,19};
        int l = a.length;

        System.out.println("Array before sorting: "+ Arrays.toString(a));

        for(int i=0; i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                }
            }
        }
        System.out.println("Arrays after bubble sort: "+Arrays.toString(a));
    }
}
