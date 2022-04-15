// Command line Arguments in Java

public class Sum {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum of 2 Numbers using command line argument : " + (a + b));
    }
}