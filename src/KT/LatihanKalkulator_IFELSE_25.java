package KT;

import java.util.Scanner;

public class LatihanKalkulator_IFELSE_25 {
    public static void main(String[] args) {

        //Inisialisasi
        Scanner userInput = new Scanner(System.in);
        float a, b, hasil;
        char operator;

        System.out.print("Nilai a = ");
        a = userInput.nextFloat();
        System.out.print("Masukkan Operator (+,-,*,/,%)\n" +
                "Operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("Nilai b = ");
        b = userInput.nextFloat();

        System.out.println("Input user: " + a + " " + operator + " " + b + "\n======================");

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            if (b == 0){
                System.out.println("Pembagi 0 Nilai tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }

        } else if (operator == '%') {
            hasil = a % b;
            System.out.println("Hasil = " + hasil);
        } else {
            System.out.println("Maaf operator tidak ada");
        }

    }
}
