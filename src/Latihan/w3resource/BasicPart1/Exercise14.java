package Latihan.w3resource.BasicPart1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("=== MENGHITUNG PERSEGI PANJANG ===");
        System.out.print("Panjang = ");
        double a = userInput.nextDouble();
        System.out.print("Lebar = ");
        double b = userInput.nextDouble();

        System.out.println("Luas = " + (a*b));
        System.out.println("Keliling = " + (2 * (a+b)));
    }
}
