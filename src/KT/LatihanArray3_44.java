package KT;
import java.util.Arrays;

public class LatihanArray3_44 {
    public static void main(String[] args) {
        char[] huruf1 = {'b', 'c', 'w', '#', 'A', '0', 'Z', 'o'};

        char[] huruf2 = Arrays.copyOf(huruf1, huruf1.length);
        printArray(huruf1, "huruf1");
        printArray(huruf2, "huruf2");

        Arrays.sort(huruf2);
        printArray(huruf2, "huruf2 Sort");

        String[] nama = {"Budi", "Zahid", "Asep", "Abu", "Hammad", "Yummi"};
        Arrays.sort(nama);
        printArray(nama, "Nama Sort");
        for (int i = 0; i < nama.length; i++){
            System.out.print(nama[i] + " ");
        }

        System.out.println();

        int[] angka1 = {6,2,8,2,4,5,0,1};
        int[] angka2 = {65,32,76,83,72,52,12,42};

        int[] angka3 = new int[angka1.length];
        for (int i = 0; i < angka1.length; i++){
            angka3[i] = angka1[i] + angka2[i];
        }

        printArray(angka3, "angka3");
        Arrays.fill(angka3, angka3[2]);
        printArray(angka3, "Fill Array");

        String search = "Yummi";
        int posisi = Arrays.binarySearch(nama, search);
        System.out.println("Nama " + search + " ada di index ke-" + posisi);

        int hasil = Arrays.compare(angka1, angka2);
        if (hasil < 0){
            System.out.println("Angka2 lebih besar dari Angka1");
            for (int i = 0; i < angka2.length; i++){
                angka2[i] = angka2[i] - 10;
            }
            printArray(angka2, "angka2 dikurangi 10");
        } else {
            System.out.println("Angka1 lebih besar");
        }

        boolean hasil2 = Arrays.equals(angka1, angka2);
        if (!hasil2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void printArray(char[] dataArray, String massage){
        System.out.println(massage + " = " + Arrays.toString(dataArray));
    }

    private static void printArray(int[] dataArray, String massage){
        System.out.println(massage + " = " + Arrays.toString(dataArray));
    }

    private static void printArray(String[] dataArray, String massage){
        System.out.println(massage + " = " + Arrays.toString(dataArray));
    }
}
