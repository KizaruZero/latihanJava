import java.util.Scanner;

public class matrixMD {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i, j;
        int n = 3;
        int[][] A = new int[n][n];
        //input matrix
        System.out.println("Input Matrix A:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]:");
                A[i][j] = keyboard.nextInt();
            }
        }

        //mencetak matrix
        System.out.println("Cetak Matrix A:");
        for (i = 0; i < n; i++) {
            System.out.print("| ");
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }

    }//end main
}//end class