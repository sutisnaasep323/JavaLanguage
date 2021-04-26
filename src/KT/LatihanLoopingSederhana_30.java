package KT;

import java.util.Scanner;

public class LatihanLoopingSederhana_30 {
    public static void main(String[] args) {

        int nilaiAwal1,nilaiAwal2,nilaiAwal3, nilaiAkhir1,nilaiAkhir2,nilaiAkhir3, total1, total2, total3;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        nilaiAwal1 = userInput.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir1 = userInput.nextInt();

        total1 = 0;

        System.out.println("===== WHILE LOOP =====");
        System.out.println("Awal Total: " + total1);

        //Menggunakan while loop
        while (nilaiAwal1 <= nilaiAkhir1){
            total1 = total1 + nilaiAwal1;
            System.out.println("Ditambah " + nilaiAwal1 + " Totalnya menjadi = " + total1);
            nilaiAwal1++;
        }

        // DO WHILE LOOP

        System.out.print("Masukkan nilai awal: ");
        nilaiAwal2 = userInput.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir2 = userInput.nextInt();

        total2 = 0;

        System.out.println("===== DO WHILE LOOP =====");
        System.out.println("Awal Total: " + total2);
        do {
            total2 = total2 + nilaiAwal2;
            System.out.println("Ditambah " + nilaiAwal2 + " Totalnya menjadi = " + total2);
            nilaiAwal2++;
        } while (nilaiAwal2 <= nilaiAkhir2);

        // FOR LOOP

        System.out.print("Masukkan nilai awal: ");
        nilaiAwal3 = userInput.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir3 = userInput.nextInt();

        total3 = 0;

        System.out.println("===== FOR LOOP =====");
        System.out.println("Awal Total: " + total3);

        for (;nilaiAwal3 <= nilaiAkhir3;nilaiAwal3++){
            total3 = total3 + nilaiAwal3;
            System.out.println("Ditambah " + nilaiAwal3 + " Totalnya menjadi = " + total3);
        }
    }
}
