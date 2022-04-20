import java.util.Scanner;

class Percentage {
    String name;
    static String section;
    int age;
    int per;

    static int total;

    Percentage(String n, String sec, int a, int p) {
        name = n;
        section = sec;
        age = a;
        per = p;
        total += p;
    }

    static float avg() {
        return (float) total / 6;
    }

    public static void main(String[] args) {
        String name, section;
        int age;
        int per;
        Scanner sc = new Scanner(System.in);
        Percentage[] arr;
        arr = new Percentage[6];

        for (int i = 0; i < 6; ++i) {
            System.out.println("Enter Name :  ");
            name = sc.nextLine();
            System.out.println("Enter Section :  ");
            section = sc.nextLine();
            System.out.println("Enter age :  ");
            age = sc.nextInt();
            System.out.println("Enter Percentage :  ");
            per = sc.nextInt();

            arr[i] = new Percentage(name, section, age, per);
        }

        System.out.println("AVerage percentage is " + Percentage.avg());
    }
}
