import java.util.Random;
import java.util.Scanner;

public class suit {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String pilihanPlayer, pilihanBot;
        System.out.print("Masukan Pilihan Anda (Gajah,Semut,Orang) = ");
        pilihanPlayer = userInput.nextLine();
        String[] array = {"Gajah", "Semut", "Orang"};
        Random acak = new Random();
        int ambilAcak = acak.nextInt(array.length);
        pilihanBot = array[ambilAcak];
        System.out.println("Permainan = " + "Pilihan Kamu = " + pilihanPlayer + " VS " + "Pilihan Bot = " + pilihanBot);
        if (pilihanPlayer.equals("Gajah") && pilihanBot.equals("Semut")) {
            System.out.println("Kamu Kalah");
        } else if (pilihanPlayer.equals("Gajah") && pilihanBot.equals("Gajah")) {
            System.out.println("Kamu Seri");
        } else if (pilihanPlayer.equals("Gajah") && pilihanBot.equals("Orang")) {
            System.out.println("Kamu Menang");
        }
        if (pilihanPlayer.equals("Semut") && pilihanBot.equals("Semut")) {
            System.out.println("Kamu Seri");
        } else if (pilihanPlayer.equals("Semut") && pilihanBot.equals("Gajah")) {
            System.out.println("Kamu Menang");
        } else if (pilihanPlayer.equals("Semut") && pilihanBot.equals("Orang")) {
            System.out.println("Kamu Kalah");
        }
        if (pilihanPlayer.equals("Orang") && pilihanBot.equals("Semut")) {
            System.out.println("Kamu Menang");
        } else if (pilihanPlayer.equals("Orang") && pilihanBot.equals("Gajah")) {
            System.out.println("Kamu Kalah");
        } else if (pilihanPlayer.equals("Orang") && pilihanBot.equals("Orang")) {
            System.out.println("Kamu Seri");
        } else {
            System.out.println("Tidak Valid");
        }
    }
}
