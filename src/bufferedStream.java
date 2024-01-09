import java.io.*;
import java.util.Arrays;

public class bufferedStream {
    public static void main(String[] args) throws IOException {
        //buffered ini intinya memproses dahulu semua data dari database baru dikirim ke program/aplikasi jadi lebih cepat
        //Membuka File
        FileInputStream fileInput = new FileInputStream("input.txt");
        //Membaca File
        System.out.println(fileInput.available()); //cek berapa char yg ada (termasuk spasi)
        int data = fileInput.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileInput.read();
        }
        System.out.println("\n");
        //Membaca dari Memory
        FileInputStream fileInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferInput = new BufferedInputStream(fileInput2);

        //Ketika menggunakan buffer kita bisa melimitasi pembacaan
        bufferInput.mark(200);
        bufferInput.reset();

        //Di Buffer kita juga bisa membaca ulang
        byte[] data3 = bufferInput.readAllBytes();
        System.out.println(Arrays.toString(data3));
        //Kita bisa langsung print out sebagai string
        String dataString = new String(data3);
        System.out.println(dataString);

        //Menulis untuk file output di Buffer
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferOutput = new BufferedOutputStream(byteOutput);
        //Write data berupa byte bukan string
        bufferOutput.write(data3, 0, data3.length);
        bufferOutput.flush();

        int data2 = bufferInput.read();
        while (data2 != -1) {
            System.out.print((char) data2);
            data2 = bufferInput.read();
        }
        System.out.println("\n");

        //Menghitung waktu membaca
        long waktuStart, waktuStop;
        waktuStart = System.nanoTime();
        System.out.println(fileInput.readAllBytes());
        waktuStop = System.nanoTime();
        System.out.println("Waktu = " + (waktuStop - waktuStart));

        //menutup
        fileInput.close();
        bufferInput.close();
        bufferOutput.close();
        fileInput2.close();

    }
}
