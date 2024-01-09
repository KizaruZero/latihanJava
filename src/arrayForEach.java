import java.util.Arrays;
import java.util.Scanner;

public class arrayForEach {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] arrayAngka = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // Mengambil isi array dengan looping standart
        for (int i = 0; i < 10; i++) {
            System.out.println("Angka indexs ke " + i + " adalah angka " + arrayAngka[i]);
        }
        // Looping dengan properti array
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("Index ke-" + i + "adalah angka-" + arrayAngka[i]);

        }
        // Looping khususon untuk collection <- array
        System.out.println("Looping dengan For Each");
        // ini digunakan saat kita ingin memasukkan angka yang ada di array ke dalam sebuah variabel dan ini digunakan saat kita tidak membutuhkan untuk print index
        for (int angka : arrayAngka) {
            System.out.println(angka); // jadi mekanismenya adalah disetiap perulangan variable angka menyimpan setiap angka yang berada di array,misal perulangan pertama angka = 11 lalu di print dan ke2 angka = 12 lalu di print dan seterusnya sampai array habis
        }
    }
}
