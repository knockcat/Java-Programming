// read from a text file char by char and write in another file,
//  in a eficient way

import java.io.*;

class Abc {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file1.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("file2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        int i = 0;
        while ((i = fr.read()) != -1) {
            bw.write((char) i);
        }

        System.out.println();
        fr.close();
        br.close();
        fw.close();
        bw.close();
    }
}
