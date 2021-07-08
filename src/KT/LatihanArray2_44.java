package KT;

import java.util.Arrays;

public class LatihanArray2_44 {
    public static void main(String[] args) {
        int[] arrayAngka1 = {6, 2, 7, 3, 4, 1, 7, 7, 3, 2};
        int[] arrayAngka2 = {9, 5, 1, 9, 8, 2, 8, 5, 5, 2};

        int[] arrayTambah = tambahArray(arrayAngka1, arrayAngka2);

        int[] arrayGabung = gabungArray(arrayAngka1, arrayTambah);

        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayTambah, "Array Tambah");
        printArray(arrayGabung, "Array Gabung");

        reverse(arrayAngka1);
        printArray(arrayAngka1, "Reverse Angka 1");

        reverse2(arrayAngka2);
        printArray(arrayAngka2, "Reverse Angka 2");

    }

    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuff = Arrays.copyOf(dataArray, dataArray.length);

        for(int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuff[(arrayBuff.length - 1) - i];
        }
    }

    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);

        for(int i = 0; i < dataArray.length/2; i++){
            int tampung = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[dataArray.length - i - 1] = tampung;
        }
    }

    private static int[] gabungArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayGabung = new int[arrayInt1.length + arrayInt2.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayGabung[i] = arrayInt1[i];
        }
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayGabung[i + arrayInt1.length] = arrayInt2[i];
        }

        return arrayGabung;
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] hasilArray = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            hasilArray[i] = arrayInt1[i] + arrayInt2[i];
        }
        return hasilArray;
    }

    public static void printArray(int[] dataArray, String massage) {
        System.out.println(massage + " = " + Arrays.toString(dataArray));
    }
}
