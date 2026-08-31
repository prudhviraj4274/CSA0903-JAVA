import java.io.FileReader;

public class CountLinesAndCharacters {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file5.txt");

            int ch;
            int characters = 0;
            int lines = 0;

            while ((ch = fr.read()) != -1) {
                characters++;

                if (ch == '\n') {
                    lines++;
                }
            }

            if (characters > 0) {
                lines++;
            }

            System.out.println("Number of characters: " + characters);
            System.out.println("Number of lines: " + lines);

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}