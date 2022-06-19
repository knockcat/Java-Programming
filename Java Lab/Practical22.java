// Write a class Display having void wish(String name) methods that wishes hello to given string name.
// Between printing hello and provided string name apply delay of 500 milliseconds.
// Suppose multiple threads are there and they are trying to access this wish() method concurrently.
// on same object then irregular output will be there. Write this application in
// such a way so that output becomes regular.

class Display {
    public static synchronized void wish(String s) {
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

class Demo {
    public static void main(String[] args) {
        Display d = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d, "Vishal");
        t1.start();
        MyThread t2 = new MyThread(d2, "Joshi");
        t2.start();
    }
}