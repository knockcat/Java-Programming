// Write a program that take your name from keyboard and writes in some text file.

import java.io.*;

class Name {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("File1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        System.out.println("Enter A String : ");
        String str = br.readLine();

        byte b[] = str.getBytes();

        bos.write(b);
        bos.close();
        fos.close();
        br.close();
        isr.close();
    }
}
