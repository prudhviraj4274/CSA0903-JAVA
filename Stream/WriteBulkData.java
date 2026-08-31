import java.io.FileOutputStream;

public class WriteBulkData {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("file2.txt");

            String s = "Hello Chandu";
            byte[] b = s.getBytes();

            fout.write(b);

            fout.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}