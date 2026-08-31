import java.io.FileWriter;

public class WriteBulkCharacters {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file4.txt");

            char[] data = { 'H', 'E', 'L', 'L', 'O' };

            fw.write(data);

            fw.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}