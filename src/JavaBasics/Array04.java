package JavaBasics;

public class Array04 {
    public static void main(String [] args) {
        // Code to Reverse the Array and store into another array

        int[] a = {328, 472, 7347, 293, 382, 4347};
        reverse(a, a.length);
    }

    static void reverse(int a[], int n){
        int[] b = new int[n];
        int j = 0;
        for( int i=a.length-1; i>=0; i--){
            b[j] = a[i];
            j++;
        }

        System.out.println("Reversed Arrays are : ");
        for(int i : b){
            System.out.print(i+ " ");
        }
    }
}
