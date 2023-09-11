import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Mmebuat kalkulator");
        System.out.print("Masukan angka pertama = ");
        double value1 = UserInput.nextInt();
        System.out.print("Masukan operasi = ");
        String operasi = UserInput.next();
        System.out.print("Masukan angka kedua = ");
        double value2 = UserInput.nextInt();
        double hasil = switch (operasi) {
            case "+" -> value1 + value2;
            case "-" -> value1 - value2;
            case "*" -> value1 * value2;
            case "/" -> value1 / value2;
            default -> {
                System.out.println("Operasi tidak valid");
                yield 0.0;
            }

        };
        System.out.println("Hasil dari hitungan anda adalah = " + hasil);
    }
}

