import java.util.Scanner;

public class methodGambar {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar;
        System.out.print("Masukan Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Masukan Lebar = ");
        lebar = userInput.nextInt();
        //luas = panjang * lebar; simple pake ini sbnernya
        gambar(panjang, lebar);
        System.out.println("Luas =" + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));

    }


    static int luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    static int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    static void gambar(int panjang, int lebar) {
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
