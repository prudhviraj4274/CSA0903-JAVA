import java.io.FileOutputStream;

public class WriteSingleByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("file1.txt");

            fout.write(65); // ASCII value of A

            fout.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}