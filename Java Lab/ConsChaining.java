import java.util.Scanner;

public class ConsChaining {
    long id;
    String name, branch, city, university;

    ConsChaining(String a) {
        name = a;
        System.out.println("Constructor with 1 argument");
    }

    ConsChaining(String a, String b) {
        this(a);
        branch = b;
        System.out.println("Constructor with 2 arguments");
    }

    ConsChaining(String a, String b, String c) {
        this(a, b);
        city = c;
        System.out.println("Constructor with 3 arguments");
    }

    ConsChaining(String a, String b, String c, String d) {
        this(a, b, c);
        university = d;
        System.out.println("Constructor with 4 argumnets");
    }

    ConsChaining(String a, String b, String c, String d, long e) {
        this(a, b, c, d);
        id = e;
        System.out.println("Constructor with 5 arguments");
    }

    void display() {
        System.out.println("Name of Student : " + name);
        System.out.println("ID of Student : " + id);
        System.out.println("Branch of Student : " + branch);
        System.out.println("City of Student : " + city);
        System.out.println("University of Student : " + university);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student : ");
        String a = sc.nextLine();

        System.out.println("Enter the branch of Student : ");
        String b = sc.nextLine();

        System.out.println("Enter the city : ");
        String c = sc.nextLine();

        System.out.println("Enter the name of the university : ");
        String d = sc.nextLine();

        System.out.println("Enter the Student Id : ");
        long e = sc.nextLong();

        ConsChaining obj = new ConsChaining(a, b, c, d, e);
        System.out.println();
        obj.display();
    }
}
