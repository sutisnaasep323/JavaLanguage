package Udemy;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        int saldo, opsi,transfer, total, deposit;

        Scanner userInput = new Scanner(System.in);

        System.out.println("====== Selamat datang di YummyBank ======");
        System.out.print("Anda ingin transaksi apa hari ini?\n" +
                "1. Transfer\n" +
                "2. Deposit\n" +
                "3. Exit\n" +
                "[1/2/3] : ");
        opsi = userInput.nextInt();

        if (opsi == 1){
            System.out.print("Masukkan saldo awal anda : ");
            saldo = userInput.nextInt();
            System.out.print("Berapa yang ingin anda transfer?: ");
            transfer = userInput.nextInt();

            total = saldo - transfer;
            if (total >= 0) {
                System.out.println("Saldo anda saat ini = " + total);
            } else {
                System.out.println("Maaf transaksi gagal, mohon cek kembali");
            }

        } else if (opsi == 2){
            System.out.print("Masukkan saldo awal anda : ");
            saldo = userInput.nextInt();
            System.out.print("Masukkan deposit anda: ");
            deposit = userInput.nextInt();
            total = saldo + deposit;
            System.out.println("Saldo anda saat ini menjadi = " + total);

        } else if (opsi == 3){
            System.out.println("Terimakasih telah bertransaksi hari ini");
        } else {
            System.out.println("Maaf pilihan anda tidak ada");
        }



    }
}
