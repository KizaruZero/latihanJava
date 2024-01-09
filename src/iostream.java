import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class iostream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = new FileInputStream("input.txt");
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());


        try (
                FileInputStream file = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")
        ) {
            int data = file.read();
            while (data != -1) {
                System.out.print((char) data);
                out.write((char) data);
                data = file.read();
            }
        }
    }
}
