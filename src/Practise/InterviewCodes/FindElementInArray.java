package Practise.InterviewCodes;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementInArray {
    // Code to search element in array
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] num = new int[5];

        // Fill array using inputs
        System.out.println("Enter "+num.length+" elements in array");
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }

        for(int i:num){
            System.out.print(i+" ");
        }

        // Search the given input element in array
        System.out.println("\nEnter the element to search");
        int search = sc.nextInt();
        // Method 1 - Using iteration
        boolean flag = false;
        for (int i : num){
            if(search==i){
                System.out.println("Element Found");
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element not found");
        }

        // Method 2 - Using Arrays.binarySearch()
        // Array need to be sorted to perform binary search
        Arrays.sort(num);
        System.out.println("Sorted Array: ");
        for(int i: num){
            System.out.print(i+" ");
        }

        System.out.println("\nUsing Binary Search");
        System.out.println("Element found at: "+Arrays.binarySearch(num, search));
    }
}
