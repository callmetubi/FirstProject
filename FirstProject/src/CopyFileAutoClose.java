import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAutoClose {
    public static void main(String[] args) throws IOException {
        int b;

        try (FileInputStream fis = new FileInputStream("file.txt");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\hp15s\\Desktop\\2ND YEAR CE\\Java Programming\\students.txt")) {

            do {
                b = fis.read();
                if ((char) b == ' ') b = '-';
                if (b != -1) fos.write(b);
            } while (b != -1);


        } catch (IOException e) {
            System.out.println("Error IO");
        }
    }
}
