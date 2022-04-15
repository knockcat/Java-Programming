import java.util.Scanner;

public class Employee {
    int Id, salary;
    String name, department;

    Employee() {
        this.Id = 0;
        name = null;
        department = null;
        salary = 0;
        System.out.println("A new Employee has been Created >>>");
    }

    void setDetails(int Id, String name, String department, int salary) {
        this.Id = Id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Employee Id : " + Id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Department : " + department);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Employee : ");
        String name = sc.nextLine();
        System.out.println("enter the Employee Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the Department : ");
        String department = sc.next();
        System.out.println("Enter the Salary : ");
        int salary = sc.nextInt();

        Employee obj = new Employee();
        obj.setDetails(id, name, department, salary);
        obj.showDetails();
    }
}
