public class StringBuff {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("HELLO");
        s.append("Java");       // will append to HELLO
        System.out.println("String After Appending Java : " + s + "\n");


        s.insert(1,"Java");
        System.out.println("String After Inserting Java at Index 1 : " + s + "\n");

        s.replace(1,2,"Java");
        System.out.println("String after replacing characters at 1 & 2 with Java : " + s + "\n");

        s.delete(1, 2);
        System.out.println("String after Deleting character at Index 1 & 2 : " + s + "\n");

        s = new StringBuffer("Hello");
        s.reverse();
        System.out.println("String HELLO after Reversing : " + s + "\n");
    }
}
