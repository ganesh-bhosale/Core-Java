package Practise.InterviewCodes;

public class SwapNumbers {
    public static void main(String [] args){
        int a = 15;
        int b = 29;
        System.out.println("Before swapping values are : a - "+a+" & b - "+b);

        // Logic 1 - Third Variable
        int temp = a;
        a = b;
        b = temp;

        // Logic 2 - Use + & - without using third variable
//         a = a+b;
//         b = a-b;
//         a = a-b;

         // Logic 3 - use * & /
//        a = a*b;
//        b = a/b;
//        a = a/b;

        // Logic 4 - use bitwise XOR (^)
//        a = a^b;
//        b = a^b;
//        a = a^b;

        // Logic 5 - Single statement
//        b = (a+b) - (a=b);

        System.out.println("After swapping values are : a - "+a+" & b - "+b);
    }
}
