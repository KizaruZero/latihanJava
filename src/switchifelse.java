import java.util.Scanner;

public class switchifelse {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Nama : ");
        input = inputUser.next();

        // Ekspresinya berupa satuan (int,long,short,byte) String atau enum
        switch (input) {
            case "Ardya":
                System.out.println("Halooo");
                break;
            case "Kizaru":
                System.out.println("Halooo boss");
                break;
            default:
                System.out.println("Kamu siapa?");
                break;
        }
        String masukan;
        System.out.print("Masukan nama anda : ");
        masukan = inputUser.next();
        switch (masukan) {
            case "Zero" -> System.out.println("Hallo" + masukan);
            case "KizaruZ" -> System.out.println("Hallo kaamuu " + masukan);
            default -> System.out.println("hallo " + masukan + " Kamu siapa?");
        }
    }
}
