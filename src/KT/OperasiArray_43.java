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




    }

    public static void printArray (int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }

}
