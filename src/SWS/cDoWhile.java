package SWS;

import java.util.Scanner;

public class cDoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();

        int nilaiAwal = 1;

        do {
            System.out.println(nilaiAwal);
            nilaiAwal++;
        } while (nilaiAwal <= batas);


    }

}
