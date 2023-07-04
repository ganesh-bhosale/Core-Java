package JavaBasics;

public class MathClass {
    public static void main(String [] args) {
        int a = 344;
        int b = 125;

        int max_value = Math.max(a,b);
        System.out.println("Max: "+max_value);

        int min_value = Math.min(a,b);
        System.out.println("Min: "+min_value);

        double power = Math.pow(23.3, 3.5);
        System.out.println("Power: "+power);

        double square_root = Math.sqrt(44802);
        System.out.println("Square Root: "+square_root);

        double cube_root = Math.cbrt(31312.3123);
        System.out.println("Cube Root: "+cube_root);

        int abs_value = Math.abs(-222);
        System.out.println("Abs_value: "+abs_value);

        long round_value = Math.round(32444.832133);
        System.out.println("Rounded Value : "+round_value);

    }
}
