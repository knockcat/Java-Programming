class CntObject {

    static int ind, knock;

    CntObject() {
        ++knock;
    }

    void count() {
        ++ind;
    }

    static void show() {
        System.out.println("Count of Member Function call " + ind);
        System.out.println("Count of Objects " + knock);
    }

    public static void main(String[] args) {
        CntObject obj1 = new CntObject();
        CntObject obj2 = new CntObject();
        CntObject obj3 = new CntObject();
        obj1.count();
        obj2.count();
        obj3.count();

        show();
    }

}