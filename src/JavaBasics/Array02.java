package JavaBasics;

public class Array02 {
    public static void main(String [] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int rows = arr.length;
        System.out.println(rows);

        for (int i=0; i<rows; i++){
            for(int j =0; j<rows; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        String arr1 [] = new String[4];
        arr1[0] = "Ganesh";
        arr1[1] = "Akash";
        arr1[2] = "Tushar";
        arr1[3] = "Atul";

        for(String i : arr1){
            System.out.println(i);
        }

    }
}
