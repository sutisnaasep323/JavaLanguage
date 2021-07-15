package KT;

import java.util.Arrays;

public class ArrayMultiDimensi_45 {
    public static void main(String[] args) {
        System.out.println("==== Array Multi Dimensi ====");

        // Cara membuat Array 2D dengan Assigment

        int[][] array_2D = {
                {1,2},
                {3,4}
        };
        printArray_2D(array_2D);

        // Cara membuat Array 2D dengan deklarasi
        // [baris][angka]
        int[][] array2_2D = new int[2][2];

        array2_2D[0][0] = 20;
        array2_2D[0][1] = 25;
        array2_2D[1][0] = 30;
        array2_2D[1][1] = 35;
        printArray_2D(array2_2D);

        // Looping secara manual
//        for (int i = 0; i < array2_2D.length; i++){
//            System.out.println("=== Looping Manual ===");
//            for (int j=0; j < array2_2D[i].length; j++){
//                System.out.print(array2_2D[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Looping dengan For Each
//        System.out.println("=== Looping For Each ===");
//        for (int[] baris : array2_2D){
//            for(int angka : baris){
//                System.out.print(angka + " ");
//            }
//            System.out.println();
//        }

        int[][] array3_2D = {
                {1,4,2},
                {6,2,8},
                {3,1,5}
        };
        printArray_2D(array3_2D);

        int[][] arrayRagged = {
                {20,62,52,41,23},
                {21,53,25},
                {54}
        };
        printArray_2D(arrayRagged);
        // mengapa arrayRagged di java itu bisa diprint? bukankah yang kita tahu array 2D itu jumlah komponen sama. insyaaAllah NEXT!

    }

//    private static void printArray_2D (int[][] dataArray){
//        System.out.println(Arrays.deepToString(dataArray));
//    }

//    private static void printArray_2D (int[][] dataArray){
//        for (int i = 0; i < dataArray.length; i++){
//            System.out.println(Arrays.toString(dataArray[i]));
//        }
//    }

    private static void printArray_2D (int[][] dataArray){
        for (int[] baris : dataArray){
            for(int angka : baris){
                System.out.print(angka + " ");
            }
            System.out.println();
        }
    }
}
