package JavaBasics;

public class ForLoop {
    public static void main(String [] args) {
        int n = 9 ;

        for (int i=1; i<=3; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }

        for (int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++){
                for(int k=1;k<=3;k++){
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }
}
