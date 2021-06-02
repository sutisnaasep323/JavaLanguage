package Latihan.w3resource.DataTypes;

import java.util.Scanner;

public class Exercise4 {
    //program Java untuk mengubah menit menjadi beberapa tahun dan hari

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        double menitdalamtahun = 60 * 24 * 365;

        System.out.println("=== Program Convert minutes to Years and Days ===");
        System.out.print("Masukkan menit: ");
        int angka = userInput.nextInt();

        long tahun = (long) (angka/menitdalamtahun);
        int hari = (angka/60/24) % 365;

        System.out.println(angka + " menit kurang lebih = " + tahun + " tahun " + hari + " hari");

    }
}
