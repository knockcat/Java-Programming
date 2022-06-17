// AutoBoxing & UnBoxing

public class Boxing_AutoBoxing {

    public static void main(String[] args) {
        int a = 100;

        Integer aobj = a; // AutoBoxing

        Float fobj = 69.9f;

        float ind = fobj; // UnBoxing

        System.out.println("a is an (primitive) int value : " + a);
        System.out.println("a is converted to an object of its Integer Wrapper Class aobj: " + aobj);
        System.out.println("fobj is an object of Float Wrapper class  : " + fobj);
        System.out.println("fobj is coverted to (primitive) float value : " + ind);

    }
}
