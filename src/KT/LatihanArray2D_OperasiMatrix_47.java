package KT;

public class LatihanArray2D_OperasiMatrix_47 {

    // Untuk Menjumlahkannya componennya harus sama

    public static void main(String[] args) {

        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };

        printArray(matrixA);
        printArray(matrixB);
        int[][] hasil = tambahMatrix(matrixA,matrixB);
        printArray(hasil);

    }

    public static int[][] tambahMatrix(int[][] matrix1, int[][] matrix2){
        int baris_a = matrix1.length;
        int kolom_a = matrix1[0].length;
        int baris_b = matrix2.length;
        int kolom_b = matrix2[0].length;

        int[][] hasil = new int[baris_a][kolom_a];

        if(baris_a == baris_b && kolom_b == kolom_a){
            for(int i = 0; i < baris_a; i++){
                for (int j = 0; j < kolom_a; j++){
                    hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return hasil;
    }

    public static void printArray(int[][] dataArray) {
        int baris_a = dataArray.length;
        int kolom_a = dataArray[0].length;

        for (int i = 0; i < baris_a; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom_a; j++) {
                System.out.print(dataArray[i][j]);
                if (j < kolom_a - 1){
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
