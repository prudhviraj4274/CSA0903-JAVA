import java.io.FileInputStream;

public class ReadBulkData {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file2.txt");

            byte[] b = new byte[100];

            int n = fin.read(b);

            System.out.println(new String(b, 0, n));

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}