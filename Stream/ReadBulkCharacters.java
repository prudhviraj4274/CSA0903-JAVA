import java.io.FileReader;

public class ReadBulkCharacters {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file4.txt");

            char[] data = new char[100];

            int n = fr.read(data);

            System.out.println(new String(data, 0, n));

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}