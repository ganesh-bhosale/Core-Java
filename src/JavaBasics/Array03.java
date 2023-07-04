package JavaBasics;

import java.sql.Array;
import java.util.Arrays;

public class Array03 {
    public static  void main(String [] args){
        // Code to Find Maximum from an array

        double a1 [] = {364.3, 324, 32434, 232,98.323, 546, 9434.4, 2367};

        double max = a1[0];
        for(int i =0; i<a1.length; i++){
            if(a1[i]>max){
                max = a1[i];
            }
        }
        System.out.println("Max is : "+max);

        // Code to find Minimum from an array

        int a2[] = {2354,455,6443,5435,6243,5657,21343,43453};
        int min = a2[0];
        for(int i=0;i<a2.length; i++){
            if (a2[i]<min){
                min = a2[i];
            }
        }
        System.out.println("Min is : "+min);

        // Copy Array
        String a3[] = {"Mango", "Watermelon", "Grapes", "Strawberry", "Apple", "Blueberry"};
        String a4[] = new String[6];

        System.arraycopy(a3,0, a4,0, 6);
        for(String i :a4){
            System.out.println(i);
        }

        // Sorting of Array
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int a5[] = {23,34,45,52,42,552};
        int a6[] = {23,34,45,52,42,552};
        int a7[] =a5;

        System.out.println(Arrays.equals(a5,a6));
        System.out.println(Arrays.equals(a5,a7));
        System.out.println(a5==a6);
        System.out.println(a5==a7);

        // Reverse the Array
        for (int k=a7.length-1; k>=0; k--){
            System.out.print(a7[k]+" ");
        }


    }
}
