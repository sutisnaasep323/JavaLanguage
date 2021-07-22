package KT;

import java.util.Arrays;

public class Java_47_LatihanArray2D_OperasiMatrix_2 {
    public static void main(String[] args) {

        int[][] array2D_1 = {
                {53,21,42},
                {23,52,12},
                {63,32,15}
        };

        System.out.println(Arrays.deepToString(array2D_1) + "\n");;
        printArray(array2D_1);

        int[][] array2D_2 = {
                {63,71,82},
                {63,72,52},
                {93,22,75}
        };

        int[][] hasil = penguranganMatrix(array2D_1, array2D_2);
        printArray(hasil);

    }

    public static int[][] penguranganMatrix(int[][] matrix1, int[][] matrix2){
        int baris = matrix1.length;
        int kolom = matrix1[0].length;

        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                hasil[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return hasil;
    }

    public static void printArray (int[][] dataArrray){
        int baris = dataArrray.length;
        int kolom = dataArrray[0].length;

        for(int i = 0; i < baris; i++){
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArrray[i][j]);
                if (j < kolom - 1 ) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
