package PetaniKode;

import java.util.Scanner;

public class BangunRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Luas Kubus = 6 x Luas Persegi");
        System.out.print("Masukkan Luas Kubus : ");
        int s = input.nextInt();

        int luas = luaskubus(s);

        System.out.println("Hasilnya : " + luas);

    }

    private static int luasPersegi (int sisi){
        return sisi * sisi;
    }

    private static int luaskubus(int sisi) {
        return 6 * luasPersegi(sisi);
    }

}
