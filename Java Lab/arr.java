import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];

        System.out.println("Enter the Elements of 2-D Array");

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j)
                a[i][j] = sc.nextInt();
        }

        System.out.println("The Array is");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j)
                System.out.println(a[i][j]);
            System.out.println();
        }

        System.out.println("Enter the key to be  Searched in the Array");
        int k = sc.nextInt();

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (k == a[i][j]) {
                    System.out.println("Key Found");
                    System.exit(0);
                }
            }
        }
        System.out.println("Key Not Found");
    }
}
