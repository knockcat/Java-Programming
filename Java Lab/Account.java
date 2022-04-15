import java.util.Scanner;

public class Account {
    int acc_no;
    String name;
    int amount;

    void insert(int acc, String n, int amt) {
        acc_no = acc;
        name = n;
        amount = amt;
    }

    void deposit(int d) {
        amount += d;
    }

    void withdraw(int w) {
        if (w < amount)
            amount -= w;
        else
            System.out.println("Error Insufficient Balance !!!");
    }

    void CheckBalance() {
        System.out.println("Balance : " + amount);
    }

    void display() {
        System.out.println("Name of Account Holder : " + name);
        System.out.println("Account Number : " + acc_no);
        System.out.println("Amount left : " + amount);
    }

    public static void main(String[] args) {
        Account obj = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Enter\n\t 1. To Enter Details \n\t 2. To Deposit\n\t 3. To Withdraw Amount\n\t 4. To Check Banlance\n\t 5. To Display all details\n\t 6. To Exit");

        System.out.println("Enter your Choice : ");

        int ch = sc.nextInt(); // user input

        do {
            if (ch == 1) {
                System.out.println("Enter the Account Number");
                int ac = sc.nextInt();
                System.out.println("Enter name of the account Holder");
                // String s = sc.nextLine(); // spaced String
                String s = sc.next();
                System.out.println("Enter the Amount");
                int amt = sc.nextInt();
                obj.insert(ac, s, amt);
            }

            else if (ch == 2) {
                System.out.println("Enter the Deposit Amount");
                int d = sc.nextInt();
                obj.deposit(d);
            }

            else if (ch == 3) {
                System.out.println("Name of Withdraw Amount");
                int w = sc.nextInt();
                obj.withdraw(w);
            }

            else if (ch == 4)
                obj.CheckBalance();

            else if (ch == 5)
                obj.display();

            else
                System.out.println("Enter a Valid Choice ...!!!");

            System.out.println("Enter Your Choice");
            ch = sc.nextInt();
        } while (ch != 6);

    }
}
