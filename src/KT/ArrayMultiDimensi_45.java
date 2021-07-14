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
        // [baris][kolom]
        int[][] array2_2D = new int[2][2];

        array2_2D[0][0] = 20;
        array2_2D[0][1] = 25;
        array2_2D[1][0] = 30;
        array2_2D[1][1] = 35;
        printArray_2D(array2_2D);

    }

//    private static void printArray_2D (int[][] dataArray){
//        System.out.println(Arrays.deepToString(dataArray));
//    }

    private static void printArray_2D (int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
