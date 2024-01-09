import java.util.Scanner;

public class sadsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseSalary, allowance, numOfChildren, grossSalary, netSalary;
        double taxRate = 0.02;

        // Input employee's class (golongan)
        System.out.print("Masukkan golongan (1, 2, 3): ");
        int golongan = scanner.nextInt();

        // Input marital status
        System.out.print("Apakah Anda sudah menikah? (Ya/Tidak): ");
        String status = scanner.next();

        // Calculate base salary based on golongan
        if (golongan == 1) {
            baseSalary = 1000000;
        } else if (golongan == 2) {
            baseSalary = 2000000;
        } else if (golongan == 3) {
            baseSalary = 3000000;
        } else {
            System.out.println("Golongan tidak valid.");
            return;
        }

        // Calculate allowance based on marital status
        allowance = (status.equalsIgnoreCase("Ya")) ? 300000 : 0;

        // Ask for the number of children if married
        numOfChildren = 0;
        if (status.equalsIgnoreCase("Ya")) {
            System.out.print("Berapa jumlah anak yang mendapat tunjangan? (Maksimal 3 anak): ");
            numOfChildren = scanner.nextInt();
            numOfChildren = Math.min(numOfChildren, 3); // Maximum 3 children allowances
        }

        // Calculate gross salary
        grossSalary = baseSalary + allowance + (numOfChildren * 100000);

        // Calculate tax for golongan 3
        if (golongan == 3) {
            double tax = grossSalary * taxRate;
            grossSalary -= tax;
        }

        // Display net salary
        System.out.println("Gaji Bersih Anda adalah: " + grossSalary);
    }
}
