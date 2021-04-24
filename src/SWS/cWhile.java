package SWS;

import java.util.Scanner;

public class cWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");

        int batas = input.nextInt();
        int nilaiAwal = batas;


    // Increment (bertambah)
//        while (nilaiAwal <= batas){
//            System.out.print(nilaiAwal + " ");
//            nilaiAwal++;
//        }

        // Decrement
        while (nilaiAwal >= 1) {
            System.out.print(nilaiAwal + " ");
            nilaiAwal--;
        }


    }

}
