package KT;

import java.util.Arrays;
import java.util.Scanner;

public class LatihanArray_44 {
    public static void main(String[] args) {

        int[] data = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < data.length; i++){
            System.out.print("Masukkan data: ");
            data[i] = input.nextInt();
        }

        printArray(data);

        int[] angka = {32, 52, 68, 22, 34, 18, 99, 70};
        int[] angkaDSC = new int[angka.length];

        // urutin dulu
        Arrays.sort(angka);
        System.out.println("==== Nilai Awal ====");
        printArray(angka);

        // Sort Terbalik
        for (int i = 0; i < angka.length; i++) {
            int temp;
            temp = angka[angka.length - i - 1]; // mengambil nilai terakhir
            angkaDSC[i] = temp;
        }
        System.out.println("==== Nilai Terbalik ====");
        printArray(angkaDSC);

        // operasi tambah dua buah array
        int[] angka2 = Arrays.copyOf(angka,angka.length);
        System.out.println("==== Menjumlahkan Array ====");
        jumlahkanArray(angka, angka2);

        //Menggabungkan dua buah array
        int[] angka3 = Arrays.copyOf(angka, angka.length);
        System.out.println("==== Menggabungkan Array ====");
        gabungArray(angka, angka3);


    }

    static void printArray(int[] data) {
        System.out.println("Arrays = " + Arrays.toString(data));
    }

    static void jumlahkanArray(int[] data1, int[] data2){
        int[] sum = new int[data1.length];

        for (int i = 0; i < data1.length; i++){
            sum[i] = data1[i] + data2[i];
        }
        printArray(sum);
    }

    static void gabungArray (int[] data1, int[] data2){
        int panjangArray = data1.length + data2.length;
        int[] hasil = new int[panjangArray];

        int x = 0;
        for (int i = 0; i < data1.length; i++){
            hasil[x] = data1[i];
            x++;
        }

        for (int i = 0; i < data2.length; i++){
            hasil[x] = data1[i];
            x++;
        }
        printArray(hasil);

    }


}
