import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int gaji, gol1, gol2, gol3, tunjanganAnak, totalAnak, tunjanganKeluarga, totalGaji;
        String status;
        gol1 = 1000000;
        gol2 = 2000000;
        gol3 = 3000000;
        tunjanganKeluarga = 300000;
        tunjanganAnak = 100000;
        totalGaji = 0;
        System.out.print("Masukan Golongan Gaji anda (1,2,3) = ");
        gaji = userInput.nextInt();
        if (gaji == 1) {
            totalGaji = gol1;
        } else if (gaji == 2) {
            totalGaji = gol2;
        } else if (gaji == 3) {
            totalGaji = gol3;
        } else {
            System.out.println("Tidak Valid");
            System.exit(0);
        }
        userInput.nextLine();
        System.out.print("Apakah anda sudah berkeluarga ? (Ya/Tidak) = ");
        status = userInput.nextLine();
        if (status.equals("Ya")) {
            System.out.print("Masukan total anak anda = ");
            totalAnak = userInput.nextInt();
            totalAnak = Math.min(totalAnak, 3);
            if (gaji == 1) {
                totalGaji = totalGaji + tunjanganKeluarga + tunjanganAnak * totalAnak;
                System.out.println("Total Gaji anda adalah = " + totalGaji);
            } else if (gaji == 2) {
                totalGaji = totalGaji + tunjanganKeluarga + tunjanganAnak * totalAnak;
                System.out.println("Total Gaji anda adalah = " + totalGaji);
            } else if (gaji == 3) {
                totalGaji = (totalGaji + tunjanganKeluarga + tunjanganAnak * totalAnak) * 98 / 100;
                System.out.println("Total Gaji anda adalah = " + totalGaji);
            }
        } else if (status.equals("Tidak") && gaji == 1) {
            System.out.println("Gaji anda adalah = " + totalGaji);
        } else if (status.equals("Tidak") && gaji == 2) {
            System.out.println("Gaji anda adalah = " + totalGaji);
        } else if (status.equals("Tidak") && gaji == 3) {
            System.out.println("Gaji anda adalah = " + totalGaji * 98 / 100);
        } else {
            System.out.println("Tidak Valid");
        }
    }
}
