package KT;

import java.util.Scanner;

public class SwitchCase_23 {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum

        switch (input){
            case "asep":
                System.out.println("Asep hadir");
                break; //untuk menghentikan/keluar dari switch case
            case "Budi":
                System.out.println("Budi hadir");
                break;
            default:
                System.out.println(input + " tidak hadir");
        }

        System.out.println("=== Selesai Program ===");
    }
}
