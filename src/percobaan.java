import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int angka1, angka2, hasil;
        String operasii;
        System.out.println("PERCOBAAN KALKULATOR");
        System.out.print("Masukan angka pertama = ");
        angka1 = userInput.nextInt();
        System.out.print("Masukan Operasi = ");
        operasii = userInput.next();
        System.out.print("Masukan angka kedua =  ");
        angka2 = userInput.nextInt();
        hasil = hitung1(angka1, operasii, angka2);
        System.out.println("Hasil perhitungan = " + hasil);


    }

    static int hitung1(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;  // note return hanya digunakan untuk mehtod
        }
    }
}