package JavaBasics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ATB Core Java");

        int num = 10;
        int sum = 0 ;
        for (int i=1; i<=10; i++) {
            sum = sum + i ;
        }
        System.out.println("Sum is " + sum );

        char c = 'G';
        int C = 'G';
        String name = "Hi I am Ganesh Bhosale !";
        System.out.println(name);
        System.out.println(C);
        System.out.println(c);

        int a = 9;
        int b = 1;
        for (int i=1; i<=10; i++) {
            b = a * i;
            System.out.printf("%d", b);
            System.out.println();
        }

        int Enum = 9;
        System.out.println(Enum);

    }
}