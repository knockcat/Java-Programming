// Write a class Display having synchronized void wish(String) methods that wishes hello to given string name.
// Between printing hello and provided string name apply delay of 500 milliseconds. Suppose multiple threads are,
// there and they are trying to access this wish() method concurrently on different objects then irregular output will be there.
// Write this application in such a way so that output becomes regular.

// This code is in Practical 22, this is without using static synchronized

class Display {
    public void wish(String s) {
        for (int i = 1; i <= 5; ++i) {
            System.out.println(s);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

class Demo1 {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Vishal");
        t1.start();
        MyThread t2 = new MyThread(d, "Joshi");
        t2.start();
    }
}

