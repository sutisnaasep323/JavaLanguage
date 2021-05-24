package KT;

import java.util.Scanner;

public class LatihanFungsi_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("==== Latihan Fungsi/Method ====");
        System.out.print("Masukkan panjang : ");
        int inputPanjang = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        int inputLebar = input.nextInt();

        System.out.println("Gambar : ");
        gambar(inputPanjang, inputLebar);

        System.out.println("Luasnya = " + luas(inputPanjang, inputLebar));
        System.out.println("Kelilingnya = " + keliling(inputPanjang, inputLebar));


    }

    private static void gambar(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
}
