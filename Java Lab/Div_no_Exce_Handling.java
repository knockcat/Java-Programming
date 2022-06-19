// Program to divide two numbers with proper exception handlers

import java.util.*;

class Div_no_Exce_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("Dividing a and b : " + (a / b));
        } catch (Exception e) {
            System.out.println("Don't divide bye 0 !! |n" + e);
        }
    }
}