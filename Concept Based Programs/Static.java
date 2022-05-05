// static block
// static method
// static variable

class StaticBlock {

    static int ind;

    static {
        System.out.println("Static Block Executes Before Main");
    }

    StaticBlock() {
        // static variable keeps the count of objects;
        ++ind;
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 60 & 9 is " + add(60, 9));

        // Creating Object
        StaticBlock obj1 = new StaticBlock();
        StaticBlock obj2 = new StaticBlock();
        StaticBlock obj3 = new StaticBlock();

        // static ind variable will keep the cnt of the onjects created

        System.out.println("Count of Objects is : " + ind);

    }

}