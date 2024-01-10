package Practise.InterviewCodes;

public class SumOfArray {
    public static void main(String [] args){
        // Code to find the some of elements in a array


        int a[] = {32,532,63,25,67,1,62};
        int sum = 0;

        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of elements in array is : "+sum);

        // Enhanced for loop
        int b [] = {7239,232,-234,-23,23,2,1,324};
        int sum1 = 0;

        for(int i : b){
            sum1 = sum1 + i;
        }
        System.out.println("Sum : "+sum1);

        // Multiplication of array elements
        int [] c = {2,53,7,19,2};
        int multiplication = 1;

        for(int i : c){
            multiplication = multiplication *i;
        }
        System.out.println("Multiplication: "+multiplication);
    }
}
