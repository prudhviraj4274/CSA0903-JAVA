import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CombineTwoFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("file1.txt");
            FileInputStream fin2 = new FileInputStream("file2.txt");

            SequenceInputStream sin = new SequenceInputStream(fin1, fin2);

            FileOutputStream fout = new FileOutputStream("output.txt");

            int data;

            while ((data = sin.read()) != -1) {
                fout.write(data);
            }

            fin1.close();
            fin2.close();
            sin.close();
            fout.close();

            System.out.println("Files combined successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}