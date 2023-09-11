import java.util.Scanner;
// jav util scanner artinya saya mengambil sebuah library scanner yang berada di folder util/java //

public class aritmatikascanner {
    public static void main(String[] args) {
        //scanner
        Scanner userinput = new Scanner(System.in);
        int panjang1, lebar1, luas1, tinggi, volume;
/*
        int input = userinput.nextInt();
        System.out.println("input = " + input); // ini kalau kita run dia gabakal berhenti/ru tersu sampai kita input di console/user interface
        int input1 = userinput.nextInt();
        System.out.println("input1 = " + input1); */
        // membuat peritungan luas dengan scanner/user input
        System.out.println("Menghitung Luas");
        System.out.print("Panjang = ");
        int panjang = userinput.nextInt();
        System.out.print("Lebar = ");
        int lebar = userinput.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas dari kotak tersebut adalah " + luas);
        // Nah enaknya disini kita bisa menggunakan method ini berkali kali,jadi tidak perlu membuat variabel baru saat ingin menghitung dengan panjang lebar berbeda,kita tinggal input panjang lebar yang kita inginkan
// versi lebih rapihnya
        System.out.println("Menghitung luas");
        System.out.print("Panjang1 = ");
        panjang1 = userinput.nextInt();
        System.out.print("Lebar1 = ");
        lebar1 = userinput.nextInt();
        luas1 = panjang1 * lebar1;
        System.out.println("Luas1 dari kotak tersebut adalah = " + luas1); // bedanya cuman lebih rapih aja codenya
        System.out.print("Tinggi = ");
        tinggi = userinput.nextInt();
        volume = luas1 * tinggi;
        System.out.println("Volume dari bangun tersebut adalah = " + volume);
        // Pengelompokan operasi aritmaetika sama seperti di real life
        int hasil = 2 + 10 * 5;
        System.out.println(hasil);

    }
}
