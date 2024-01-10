package Practise.InterviewCodes;

public class MaxMinInArray {
    // Java program to calculate Max & Min value in array
    public static void main(String [] args){
        int numArray[] = {239,44,112,5,123,554,778,23,77,793,352};
        int max = maxValueInArray(numArray);
        System.out.println(max);

        MaxMinInArray min = new MaxMinInArray();
        min.minValueInArray(numArray);
    }

    public static int maxValueInArray(int [] array){
        System.out.println("Max value in array is");

        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public void minValueInArray(int[] array){
        System.out.println("Min value in a array is ");
        int min = array[0];

        for(int i:array){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }

}
