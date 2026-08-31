import java.io.FileReader;

public class ReadSingleCharacter {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file3.txt");

            int data = fr.read();

            System.out.println((char) data);

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}