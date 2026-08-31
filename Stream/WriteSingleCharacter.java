import java.io.FileWriter;

public class WriteSingleCharacter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file3.txt");

            fw.write('A');

            fw.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}