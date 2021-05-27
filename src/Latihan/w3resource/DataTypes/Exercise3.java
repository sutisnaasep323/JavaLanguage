package Latihan.w3resource.DataTypes;

import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat antara 0 - 1000 : ");
        int bil = userInput.nextInt();

        System.out.println("Jumlah semua digit pada " + bil + " adalah " + sum(bil));
    }

    private static int sum (int angka){
        int jumlah = 0;

        while (angka != 0){
            jumlah = jumlah + angka % 10;
            angka = angka / 10;
        }

        return jumlah;
    }
    /*
    565

    0 + 565 % 10 (0+5)
    => 5

    565 / 10
    > 56

    5 + 56 % 10 (5 + 6)
    => 11

    56 / 10
    > 5

    11 + 5 % 10 (11 + 5)
    => 16 --------- v

    5/10
    > 0
     */
}
