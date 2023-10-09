public class loopingBersarang {
    public static void main(String[] args) {
        System.out.println("Menggambar Menggunakan Java");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("TUGAS TEST OTAK BIAR GA GOBLOK");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j <= 3) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j) < 4) {
                    System.out.print("  ");
                } else if ((i + j) > 12) {
                    System.out.print("  ");
                } else if ((i - j) >= 5) {
                    System.out.print("  ");
                } else if ((j - i) >= 5) {
                    System.out.print("  ");
                } else
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
    }
}
