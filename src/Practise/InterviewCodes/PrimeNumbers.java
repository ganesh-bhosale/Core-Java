package Practise.InterviewCodes;

public class PrimeNumbers {
    public static void main(String [] args){
        // Code to find the Prime Numbers

        int num = 17;
        int count = 0;

        if(num>=1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Number is a prime number");
            }
            else{
                System.out.println("Number is not a prime number");
            }

        }
        else{
            System.out.println("Invalid Input, please enter positive number");
        }

        // Called method to find prime numbers between range
        findPrimeNumbersBetween(1,100);
        findPrimeNumber(num);
    }

    public static void findPrimeNumbersBetween(int start, int last){
        int count = 0;

        System.out.println("Prime Numbers between "+start+" and "+last+ " are : ");
        if(start>=1){
            for(int i = start; i<=last;i++){
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count ==2){
                    System.out.print(i+" ");
                }
                count = 0;
            }
        }
        else{
            System.out.println("Invalid Input, ");
        }
    }

    public static void findPrimeNumber(int num){
        boolean flag = true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                flag = false;
            }
        }

        if(flag==true){
            System.out.println("\nPrime Number");
        }
        else{
            System.out.println("\nNot a prime number");
        }
    }
}
