package Latihan.w3resource.DataTypes;

import java.util.Scanner;

public class Exercise1 {
    // Fahrenheit to celcius
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("=== CONVERT SUHU >> F TO C << ===");
        System.out.print("Masukkan temperatur Fahrenheit : ");
        double fh = userInput.nextDouble();

        System.out.println("Celsius dari " + fh + "F" + " adalah : " + celsius(fh));

    }

    static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
