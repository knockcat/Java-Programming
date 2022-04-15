public class Student {
    long id;
    String branch, name, university;

    void setDetails(String a, String b, String c, long x) {
        name = a;
        branch = b;
        university = c;
        id = x;

    }

    void showDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Student Branch : " + branch);
        System.out.println("Student University : " + university);
    }

    public static void main(String[] args) {
        String a = "Knockcat";
        String b = "Computer Science";
        String c = "GEHU";
        long x = 2018861;

        Student s = new Student();
        s.setDetails(a, b, c, x);
        s.showDetails();
    }
}
