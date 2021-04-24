package SWS;

public class QuickSort {

    public static void main(String[] args) {

        int nilai[] = {62, 45, 52, 95};
        quickSort(nilai);

    }

    private static void quickSort(int[] angka) {

        System.out.println("===Sebelum===");
        for ( int a : angka){
            System.out.print(a + " ");
        }

        // panggil function tsb, dan masukkan argumen kedalam parameter angka, set index awal = 0, dan set indexAkhir = batas akhirnya (6)
        quickSortAlgoritm(angka, 0, angka.length-1);

        System.out.println("\n===Sesudah===");
        for ( int a : angka){
            System.out.print(a + " ");
        }

    }

    private static void quickSortAlgoritm(int[] angka, int indexAwal, int indexAkhir) {

        int i = indexAwal, j = indexAkhir, pivot = angka[indexAwal];

        // mengecek apakah ada data yang belum urut?
        while (i <= j){

            //kalau masih ada berarti lakukan perulangan i dan j. i = kiri pivot dan j = kanan pivot
            //apakah index ke i (sebelah kiri dari pivot) nilainya kurang dari pivot? kalau ya i++
            while (angka[i] < pivot){
                i++;
            }

            //apakah index ke j (sebelah kanan dari pivot) nilainya lebih besar dari pivot? kalau ya j--
            while (angka[j] > pivot){
                j--;
            }

            // apakah  nilai    i <= j jika ya maka ditukar
            if (i <= j){
                int tampungan = angka[i];
                angka[i] = angka[j];
                angka[j] = tampungan;
                i++;
                j--;
            }

        }

        //melakukan pengecekan kedua kalinya agar bagian sisi kiri dan kanan semuanya ngurut

        //mengecek sisi kiri
        if (indexAwal < j){
            quickSortAlgoritm(angka, indexAwal, j);
        }

        //mengecek sisi kanan
        if (i < indexAkhir){
            quickSortAlgoritm(angka, i, indexAkhir);
        }

    }

}
