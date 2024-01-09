import java.util.Scanner;

public class hitungKPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan dua bilangan integer
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Menghitung KPK tanpa menggunakan fungsi FPB
        int kpk = hitKPK(bilangan1, bilangan2);

        // Menampilkan hasil KPK
        System.out.println("KPK dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + kpk);
    }

    // Fungsi untuk menghitung KPK tanpa menggunakan fungsi FPB
    public static int hitKPK(int a, int b) {
        int maks = Math.max(a, b);

        while (true) {
            if (maks % a == 0 && maks % b == 0) {
                return maks;
            }
            maks++;
        }
    }
}
