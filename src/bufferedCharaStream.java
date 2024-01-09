import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class bufferedCharaStream {
    public static void main(String[] args) throws IOException {
        //Membaca File
        FileReader fileInput = new FileReader("input2.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        bufferInput.mark(200);

        //Membaca kedalam String
        String data = bufferInput.readLine();
        System.out.println(data);

        //Membaca kedalam Char versi simple
        bufferInput.reset();
        char[] dataChar = new char[data.length()];
        bufferInput.read(dataChar, 0, data.length());
        System.out.println(Arrays.toString(dataChar));

        bufferInput.reset(); // ini untuk mereset yg sudah dibaca
        //Misal ingin memunculkan 1/1 atau char seperti sebelumnya
        System.out.println((char) bufferInput.read());

        //Membaca baris dari file
        bufferInput.reset();
        System.out.println(bufferInput.readLine());
        System.out.println(bufferInput.readLine());

    }
}
