// Create LowBalanceException that occurs when user tries to withdraw some 
// amount that is greater than his current bank balance. To withdraw you have to 
// write a void withdrawal(int amount) method.

import java.util.*;

class LowBalanceException extends RuntimeException {
    LowBalanceException(String s) {
        super(s);
    }
}

class Acc {
    int bal = 1000;

    void withdraw(int amt) {
        if (amt > bal)
            throw new LowBalanceException("Insufficient Balance \n");
        else
            bal -= amt;
    }

    public static void main(String[] args) {
        Acc obj = new Acc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be Withdrawn : ");
        int amt = sc.nextInt();
        obj.withdraw(amt);
        System.out.println("Balance : " + obj.bal);
    }
}