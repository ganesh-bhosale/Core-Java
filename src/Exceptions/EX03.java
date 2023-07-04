package Exceptions;

public class EX03 {
    public static void main(String [] args){
        ProblemF pf = new ProblemF();
        int x = pf.show();
        System.out.println(x);
    }
}


class ProblemF{
    int a = 10;
    int show(){
        try{
            a = 10/0;
            System.out.println("In Try block -> "+a);
            return a;
        }
        catch (Exception e ){
            System.out.println("In Catch block ");
            a = 20;
            return a;
        }
        finally {
            System.out.println("In Finally block");
            // When final block has some exception
            try{
                int [] a1 = new int[-1];
            }
            catch (Exception e){
                System.out.println("Catch block inside Finally block");
                e.printStackTrace();
            }
        }
    }
}
