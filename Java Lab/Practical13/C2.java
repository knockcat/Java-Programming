package p2;

import p1.*;

public class C2 extends C1 implements I1 {
    public int mult(int a, int b)
    {
        return (a * b);
    }

    public static void main(String[] args) {
        C1 obj = new C1();
        C2 obj2 = new C2();

        System.out.prinln("Sum Method : " + obj.sum(2, 3));
        System.out.prinln("Division Method : " + obj.sum(4, 2));
        System.out.prinln("Interface Method Multiply : " + obj.sum(10, 5));

    }
}
