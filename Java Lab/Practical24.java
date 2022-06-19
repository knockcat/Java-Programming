// Write a class Customer having balance as a property and void withdrawal(int amount), and void deposit(int amount) as instance methods.
//  There are two threads, the first thread wants to withdrawal some amount and second thread wants to deposit some amount.
//  Apply inter thread communication where, if withdrawal amount is higher than current balance then first thread will wait for second thread to deposit then resume the withdrawal

class Customer {
    int bal = 1000;

    public synchronized void withdraw(int amt) {
        if (this.bal < amt) {
            System.out.println("Less Balance .. Kindly Wait");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.bal -= amt;
    }

    public synchronized void deposit(int amt) {
        System.out.println("Going To Deposit ..");
        this.bal += amt;
        System.out.println(("Deposited ... And total balance is " + bal));
        notify();
    }
}

class MyThread1 extends Thread {
    Customer c;

    MyThread1(Customer c) {
        this.c = c;
    }

    public void run() {
        c.withdraw(1500);
    }
}

class MyThread2 extends Thread {
    Customer c;

    MyThread2(Customer c) {
        this.c = c;
    }

    public void run() {
        c.deposit(1000);
    }
}

class Knock {
    public static void main(String[] args) {
        Customer c = new Customer();

        MyThread1 t1 = new MyThread1(c);
        t1.start();

        MyThread2 t2 = new MyThread2(c);
        t2.start();
    }
}

