package KT;

import java.util.Scanner;

public class LatihanOperatorLogika_19 {
    public static void main(String[] args) {

        // Membuat sebuah objek untuk menangkap input dari user
        Scanner userInput = new Scanner(System.in);

        // Buat sebuah program sederhana untuk menebak angka benar
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda : ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);

        //Operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda : " + statusTebakan);

        //Operasi aljabar boolean and / or

        System.out.print("Masukkan nilai diantara 4 sampai 9 : ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9); // && itu aljabar boolean
        System.out.println("Nilai tebakan anda : " + statusTebakan);

         /* AND
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
    }
}
