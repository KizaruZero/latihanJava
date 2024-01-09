import java.util.Scanner;

public class hitungFPB {
    // Fungsi untuk menghitung FPB
    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan dua bilangan integer
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Memanggil fungsi hitungFPB dan menampilkan hasilnya
        int fpb = hitungFPB(bilangan1, bilangan2);
        System.out.println("FPB dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + fpb);
    }
}
