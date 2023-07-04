package Exceptions.throwsEx;

public class RunBank {
    public static void main(String [] args) throws Exception{

        Bank chase = new Bank("USD", 500);
        Bank hdfc = new Bank("INR", 500);
        System.out.println(chase.add(hdfc));
    }
}
