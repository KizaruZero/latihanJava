import java.util.Scanner;

public class elseX {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char user;
        do {
            System.out.print("Masukan Char = ");
            user = userInput.next().charAt(0);
            System.out.println(user);
        } while (user != 'x' && user != 'X');
    }
}
