// Write a program that take your name from keyboard and writes in some text file.

class A extends Thread{
    public void run()
    {
        for(int i = 1; i<= 10; ++i)
            System.out.println("From A : "+ i + " ");
    }
}

class B extends Thread{
    public void run()
    {
        for(int j = 1; j<= 10; ++j)
            System.out.println("From B : " + j + " ");
    }
}

class C extends Thread{
    public void run()
    {
        for(int k = 1; k<= 10; ++k)
            System.out.println("From C : " + k + " ");
    }
}

class XYZ
{
    public static  void main(String[] args)
    {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
}