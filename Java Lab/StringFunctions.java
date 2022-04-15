/*
 * Apply following functions on the String "Java".
 * (i) Try to concat "Welcome" and write down your observation.
 * (ii) Find character at index 1
 * (iii) Find index of first 'a'.
 * (iv) Find index of second 'a'
 * (v) Compare "Java" to "JAVA"
 * (vi) Compare "Java" to "JAVA" ignoring the case
 * (vii) Find the index of first 'a' from last
 */

public class StringFunctions {
    public static void main(String args[]) {
        String s = "Java";
        System.out.println(s.concat("Welcome")); // print JavaWelcome but will not change
        System.out.println("Character at Index 1 : " + s.charAt(1)); // a
        System.out.println("Index of First 'a' : " + s.indexOf('a')); // 1
        System.out.println("Index of last / second 'a' : " + s.lastIndexOf('a')); // 3

        String vs = "JAVA";
        System.out.println("Comparing Java to JAVA : " + s.equals(vs)); // not equal different cases
        System.out.println("Comparing Java to JAVA ignoring cases : " + s.equalsIgnoreCase(vs)); // this will ignore cases and check strings
        System.out.println("Index of first a from last : " + s.lastIndexOf('a')); // index from last
    }
}
