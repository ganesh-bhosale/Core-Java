package JavaBasics;

public class switch01 {
    public static void main(String [] args) {
        int a = 65 ;
        final int b = 15 ;
        char c = 'A' ;

        switch (a) {
            case 5:
                System.out.println("Five");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case b:
                System.out.println("Fifteen");
                break;
            case 'A':
                System.out.println("A");
                break;
            default:
                System.out.println("No Result");
        }

        char ch = 'I';
        if(ch >=65 && ch<=90){
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Character is Vowel");
                    break;
                default:
                    System.out.println("Character is Consonant");
            }
        }
        else{
            System.out.println("Invalid Character");
        }


    }
}
