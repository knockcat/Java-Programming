// Write a program to set and get the name of threads also set and get the priority of threads.

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; ++i)
            System.out.print("From A : " + i + " ");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; ++i)
            System.out.print("From A : " + i + " ");
    }
}

class C extends Thread {
    public void run() {
        for (int j = 1; j <= 10; ++j)
            System.out.print("From A : " + j + " ");
    }
}

public class Practical21 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Getting Thread A Name : " + a.getName());
        System.out.println("Getting Thread B Name : " + b.getName());
        System.out.println("Getting Thread C Name : " + c.getName());

        a.setName("Thread_1");
        b.setName("Thread_2");
        c.setName("Thread_3");
        
        System.out.println("Getting Thread A Name after setting: " + a.getName());
        System.out.println("Getting Thread B Name after setting: " + b.getName());
        System.out.println("Getting Thread C Name after setting: " + c.getName());

        System.out.println("Getting Thread A Priority : " + a.getPriority());
        System.out.println("Getting Thread B Priority : " + b.getPriority());
        System.out.println("Getting Thread C Priority : " + c.getPriority());

        a.setPriority(1);
        b.setPriority(9);
        c.setPriority(7);

        System.out.println("Getting Thread A Priority after Setting : " + a.getPriority());
        System.out.println("Getting Thread B Priority after Setting : " + b.getPriority());
        System.out.println("Getting Thread C Priority after Setting : " + c.getPriority());
    }
}
