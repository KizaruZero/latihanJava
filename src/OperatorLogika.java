import java.util.Scanner;

public class OperatorLogika {
    public static void main(String[] args) {
        // Membuat sebuah object untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);


        // Mmebuat sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 10;
        int nilaiTebakan;
        boolean statusTebakan;
        System.out.print("Masukan nilai tebakan anda = ");
        nilaiTebakan = inputUser.nextInt();
       /* if (nilaiTebakan == nilaiBenar) {
            System.out.println("Selamat nilai tebakan anda Benar");
        } else {
            System.out.println("Maaf tebakan anda salah,silahkan coba lagi");
        } */ // ini kalau menggunakan if else,selanjutnya menggunakan operator logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Status tebakan anda adalah = " + statusTebakan);
        // Operasi aljabar boolean ( and / or)
        System.out.print("Masukan nilai tebakan anda diantara 5 dan 9: ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 5) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda adalah = " + statusTebakan);
    }
}
