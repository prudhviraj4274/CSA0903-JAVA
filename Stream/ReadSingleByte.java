import java.io.FileInputStream;

public class ReadSingleByte {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file1.txt");

            int data = fin.read();

            System.out.println((char) data);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}