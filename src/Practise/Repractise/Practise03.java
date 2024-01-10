package Practise.Repractise;

import java.util.Arrays;
import java.util.Scanner;

public class Practise03 {
    public static void main(String [] args){
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf( "%-15s%03d %n", s1, x);
        }
        System.out.println("================================");*/

        int [] num = {1,2,3,4,5,6,7,8,9,10};
        //n1 < n2 > n3 < n4 > n5
        //0    1    2    3    4

        Arrays.sort(num);
        // 5,9,23,42,77,677
        // 5,23,9,677,42,77
        int ans[] = new int[num.length];

        int i=0;
        int j=num.length-1;
        int k = 0;

        while(k < num.length) {

            if(k%2 != 0)
                ans[k]=num[j--];
            else
                ans[k] = num[i++];

            k++;
        }

        for(int g : ans){
            System.out.print(g+" ");
        }

    }
}
