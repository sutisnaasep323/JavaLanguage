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

        int[][] hasilPengurangan = penguranganMatrix(array2D_1, array2D_2);
        printArray(hasilPengurangan);

        int[][] array2D_3 = {
                {6,3,7,1},
                {4,1,2,8},
                {9,2,5,2},
                {5,1,3,1}
        };

        int[][] array2D_4 = {
                {2,3,2,1},
                {5,1,1,8},
                {1,2,4,2},
                {5,2,6,1}
        };

        int[][] hasilPerkalian = perkalianMatrix(array2D_3, array2D_4);
        printArray(hasilPerkalian);

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

    public static int[][] perkalianMatrix(int[][] matrix1, int[][] matrix2){
        int baris_1 = matrix1.length;
        int kolom_1 = matrix1[0].length; // kolom matrix 1

        int baris_2 = matrix2.length;
        int kolom_2 = matrix2[0].length; // kolom matrix 2

        int[][] hasil = new int[baris_1][kolom_2];

        if (kolom_1 == baris_2){
            int nilai;

            for(int baris = 0; baris < baris_1; baris++){

                for(int kolom = 0; kolom < kolom_2; kolom++){
                    nilai = 0;
                    for (int NumNow = 0; NumNow < kolom_1; NumNow++){
                        /*
                        Alurnya :
                        1. baris[0] => kolom [0] pada matrix 1 * baris[0] => kolom [0] pada matrix 2
                        2. baris[0] => kolom [1] pada matrix 1 * baris[1] => kolom [0] pada matrix 2
                        3. baris[0] => kolom [2] pada matrix 1 * baris[2] => kolom [0] pada matrix 2
                        3. baris[0] => kolom [3] pada matrix 1 * baris[3] => kolom [0] pada matrix 2
                        4. Semuanya ditambah
                        5. (Baris dan Kolom akan menyesuaikan)
                         */
                        nilai += (matrix1[baris][NumNow] * matrix2[NumNow][kolom]);
                    }
                    hasil[baris][kolom] = nilai;
                }
            }

        } else if (kolom_1 != kolom_2){
            String massage = "ada komponen yang tidak sama";
            System.out.println(massage);
        } else {
            String massage = "Baris atau kolom tidak sama";
            System.out.println(massage);
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
