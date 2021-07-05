package KT;

import java.util.Arrays;

public class OperasiArray_43 {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};

        //merubah array menjadi string
        System.out.println("=================\nMerubah array menjadi string\n=================");
        printArray(arrayAngka1);

        //mengkopi array
        System.out.println("\n=================\nMengkopi array\n=================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

            //mengkopi menggunakan for loop
        System.out.println("\n>> Mengkopi dengan FOR LOOP");
        for (int i = 0; i < arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1); //cetak memori
        printArray(arrayAngka2);
        System.out.println(arrayAngka2); //cetak memori

            //mengkopi menggunakan function copyOf()
        System.out.println("\n>> Mengkopi dengan copyOf()");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,6);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1); //cetak memori
        printArray(arrayAngka3);
        System.out.println(arrayAngka3); //cetak memori

            //mengkopi menggunakan function copyOfRange(), copy dari index mana sampai mana
        System.out.println("\n>> Mengkopi dengan copyOfRange()");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3, 5); // to disini adalah batas akhirnya, batas yang akhirnya tidak diambil
        printArray(arrayAngka1);
        System.out.println(arrayAngka1); //cetak memori
        printArray(arrayAngka4);
        System.out.println(arrayAngka4); //cetak memori

            //fill array, adalah menjadikan isi array itu sama semua
        System.out.println("\n=================\n\tFill Array\n=================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,7);
        printArray(arrayAngka5);

        //Komparasi (membandingkan)
        System.out.println("\n=================\nKomparasi Array\n=================");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,5,4,5};

        System.out.println("\n>> Membandingkan dengan dua buah Array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("Array sama");
        } else {
            System.out.println("Array beda");
        }

        System.out.println("\n>> Mengecek Array mana yang lebih besar");
        /*
        0 -> sama
        > 0 -> array pertama lebih besar dari array kedua
        < 0 -> array kedua lebih besar dari array pertama
         */
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\n>> Mengecek index mana yang berbeda");
        /*
        -1 -> tidak ada yang berbeda
        (disebutkan) -> index tersebut yang berbeda
        Note : tetapi yang disebutkan adalah index pertama kali berbeda
         */
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //Sort Array
        System.out.println("\n=================\n\tSort Array\n=================");
        int[] arrayAngka8 = {7,3,9,4,7,5,1,8};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //Search Array, search menggunakan binarySearch tetapi harus diurutkan dulu datanya
        System.out.println("\n=================\nSearch Array\n=================");
        int searchAngka = 7;
        int posisi = Arrays.binarySearch(arrayAngka8, searchAngka);
        System.out.println("Angka " + searchAngka + " ada di index ke " + posisi);

        /*
        Latihan :
        1. sort terbalik
        2. operasi tambah antara dua buah array
        3. Menggabungkan dua buah array
         */
    }

    public static void printArray (int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }

}
