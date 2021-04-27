package Latihan.w3resource.BasicPart1;

public class Exercise18 {
    //Konversi desimal to biner

    public static void main(String[] args) {
        int angka = 5;

        String binary = Integer.toBinaryString(angka);

        System.out.println("Bilangan biner dari " + angka + " = " + binary);
    }
}
