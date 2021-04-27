package Latihan.w3resource.BasicPart1;

public class Exercise16 {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 15;

        System.out.println("==== Sebelum di swap ====");
        System.out.println("Nilai angka1: " + angka1);
        System.out.println("Nilai angka2: " + angka2);

        int swap = angka1;
        angka1 = angka2;
        angka2 = swap;

        System.out.println("==== Sebelum di swap ====");
        System.out.println("Nilai angka1: " + angka1);
        System.out.println("Nilai angka2: " + angka2);
    }
}
