import java.util.Scanner;

public class overloadFunction {
    public static void main(String[] args) {
        // Overload Function digunakan untuk mengambil argument yg tidak tetap/berbeda. Misallnya kita membuat sebuah function yang berisi integer tapi kita ingin memasukan float didalam fungsi tersebut dengan fungsi yang sama/ agar tidak menggunakan banyak fungsi.
        Scanner userInput = new Scanner(System.in);
        printAngka(10);
        printAngka(10.5f);
        // nah ini hebatnya,si java bisa memilih sendiri fungsi mana yang digunakan untuk inputan yang tepat
        System.out.print("Masukan angka int = ");
        int integer = userInput.nextInt();
        printAngka(integer);
        System.out.print("Masukan angka float = ");
        float angkFloat = userInput.nextFloat();
        printAngka(angkFloat);
        int hasilInt = tambah(5, integer);
        printAngka(hasilInt);
        float hasilFloat = tambah(angkFloat, integer);
        printAngka(hasilFloat);

    }

    private static float tambah(float angka1, int angka2) {
        return angka1 + angka2;
    }

    private static int tambah(int angka1, int angka2) {
        return angka1 + angka2;
    }

    private static void printAngka(float angkaFloat) {
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }

    private static void printAngka(int angkaInt) {
        System.out.println("Angka ini adalah Integer dengan nilai = " + angkaInt);
    }
}
