import java.util.Scanner;

public class Shape {
    void area(double r) {
        System.out.println("Area of Circle : " + (3.14 * r * r));
    }

    void area(int s) {
        System.out.println("Area of Square : " + (s * s));
    }

    void area(int l, int b) {
        System.out.println("Area of Rectangle : " + (l * b));
    }

    void area(float b, float h) {
        System.out.println("Area of Triangle : " + (0.5 * b * h));
    }

    public static void main(String args[]) {
        Shape s = new Shape();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of the Circle : ");
        double r = sc.nextDouble();
        s.area(r);

        System.out.println("Enter Side of Square : ");
        int a = sc.nextInt();
        s.area(a);

        System.out.println("Enter Length and Breath of Rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        s.area(l, b);

        System.out.println("Enter Base and Height of Triangle : ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        s.area(x, y);
    }
}
