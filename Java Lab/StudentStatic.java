public class StudentStatic {
    long id;
    String name, branch;
    static String university = "GEHU";

    void setDetails(String a, String b, long x) {
        name = a;
        branch = b;
        id = x;
    }

    void showDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Branch : " + branch);
        System.out.println("University : " + university);
    }

    public static void main(String[] args) {
        String a = "VISHU";
        String b = "Computer Science";
        long x = 989679;
        StudentStatic obj = new StudentStatic();
        obj.setDetails(a, b, x);
        obj.showDetails();
    }
}