import java.io.*;

public class ReadBytes {
    public static void main(String args[]) {
        try {
            FileInputStream fi = new FileInputStream("abc.txt");
            int a = fi.read();
            while (a != -1) {
                System.out.println((char) a);
                a = fi.read();
            }
            fi.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
