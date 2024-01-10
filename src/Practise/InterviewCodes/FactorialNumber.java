package Practise.InterviewCodes;

public class FactorialNumber {
    public static void main(String [] args){

        int num = 5;
        int factorial = 1;

        // Using for loop
        for(int i=1 ; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial : "+factorial);

        // Using while loop
        int factorial1 = 1;
        while(num >0){
            factorial1 = factorial1 * num;
            num--;
        }
        System.out.println("Factorial - "+factorial1);
    }
}
