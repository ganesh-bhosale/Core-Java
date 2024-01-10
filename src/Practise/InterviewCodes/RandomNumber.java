package Practise.InterviewCodes;

import java.util.Random;

public class RandomNumber {
    public static void main(String [] args){
        // Method 1 - Random Method
        Random random = new Random();

        int rand_int = random.nextInt(100);
        System.out.println(rand_int);

        double rand_double = random.nextDouble(1000);
        System.out.println(rand_double);

        float rand_float = random.nextFloat(1);

        // Method 2 - Math
        System.out.println(Math.random());
    }
}
