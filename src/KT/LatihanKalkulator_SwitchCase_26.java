package KT;

import java.util.Scanner;

public class LatihanKalkulator_SwitchCase_26 {

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

        System.out.println("Input user : " + a + " " + operator + " " + b + "\n======================");

        switch (operator) {
            case '+':
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case '%':
                hasil = a % b;
                System.out.println("Hasil = " + hasil);
                break;
            case '/':
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator tidak ada");
        }
        //jika ingin lebih lanjut belajar calculator maka cari = scientific calculator

        //perulangan = program dieksekusi berdasarkan tenggang waktu tertentu/syarat-syarat tertentu
    }
}
