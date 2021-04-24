package SWS;

public class MergeSort {

    public static void main(String[] args) {

        int[] nilai = {32, 74, 23, 61, 35, 75, 62};
        MergeSortInt(nilai);

        double[] ipk = {3.4, 4.0, 2.5, 3.2, 2.7};
        MergeSortDouble(ipk);

        String[] absen = {"Siti", "Joko", "Yumi", "Budi", "Asep", "Abu"};
        MergeSortString(absen);

        char[] karakter = {'k', 'A', 'o', '4', 'a', 'y', 'D', '%', '*'};
        MergeSortChar(karakter);

    }

    public static void MergeSortInt (int[] bilangan){

        System.out.println("===Sebelum===");
        for (int b : bilangan){
            System.out.print(b + " ");
        }

        //data yang masuk di variabel bilangan mergeSortInt akan di set ulang/diubah nilainya
        // dari pengembalian function pemisahan. apapun pengembalian dari function pemisahan
        bilangan = PemisahanInt(bilangan);

        System.out.println("\n===Sesudah===");
        for (int b : bilangan){
            System.out.print(b + " ");
        }

    }

    public static int[] PemisahanInt (int[] bilangan){

        // kalau data bilangan sudah menjadi satuan maka kembalikan data/nilai arraynya
        // kalau belum maka akan dipecah terus
        if (bilangan.length <= 1){
            return bilangan;
        }

        // menyimpan data kiri dan kanan
        int nilaiTengah = bilangan.length / 2;

        int[] kiri = new int[nilaiTengah];
        int[] kanan;

            // cek nilai sisi kanan ganjil atau genap
        if (bilangan.length % 2 == 0){
            kanan = new int[nilaiTengah];
        } else {
            kanan = new int[nilaiTengah + 1]; // karena jika ganjil tidak bisa koma, solusinya tambah 1 di sisi kanan
        }

        // mengisi array sisi kiri dan kanan
        for ( int i = 0; i < kiri.length; i++){
            kiri[i] = bilangan[i]; // normal
        }

        for ( int i = 0; i < kanan.length; i++){
            // nilai tengah + index ke berapa = pengisian
            kanan[i] = bilangan[nilaiTengah + i]; // jika nilai tengah tersebut 3 maka mengisi mulai data dari index ke 3 + i
        }

        // melakukan pemisahan kembali sisi kanan dan kiri dengan memanggil fungsi ini (pemisahan)
        // rekursive
        kiri = PemisahanInt(kiri);
        kanan = PemisahanInt(kanan);

        // kemudian selanjutnya kita pisah lagi agar data/nilai menjadi satuan, tetapi kita sudah membuat programnya diawal



        // selanjutnya kita siapkan array untuk "menampung pengembalian" array dari fungsi Penggabungan
        // jadi ini akan membuat tampungan sesuai sisi kiri dan kanan yang ingin digabungkan
        int hasil[] = new int[bilangan.length]; // cara pertama
        // int hasil[] = new int[kiri.length + kanan.length]; // cara kedua

        // kemudian isi array 'hasil' dari data yang sudah digabung
        hasil = PenggabunganInt(kiri, kanan);

        // nilai yang sudah digabungkan akan dikembalikan kepada variabel hasil yang akan diterima di variabel bilangan
        return hasil;
    }

    //function penggabungan
    private static int[] PenggabunganInt(int[] kiri, int[] kanan) {
        //siapkan array kosong yang "akan diisi dari sisi kanan dan kiri" yang sudah diurutkan
        int hasilGabung[] = new int[kiri.length + kanan.length];

        //siapin penanda index kiri, kanan dan indexHasilGabung (totalnya)
        int indexKiri = 0, indexKanan = 0, indexHasilGabung = 0;

        // perulangan untuk mengisi array hasilGabung
        while (indexKiri < kiri.length || indexKanan < kanan.length){

            // cek apakah sisi kiri dan kanan masih ada / belum dibandingkan
            if ( indexKiri < kiri.length && indexKanan < kanan.length){

                if (kiri[indexKiri] < kanan[indexKanan]){
                    hasilGabung[indexHasilGabung] = kiri[indexKiri];
                    indexHasilGabung++;
                    indexKiri++;
                } else {
                    hasilGabung[indexHasilGabung] = kanan[indexKanan];
                    indexHasilGabung++;
                    indexKanan++;
                }

            } else if (indexKiri < kiri.length){
                // kalau hanya kiri aja yang masih tersedia
                hasilGabung[indexHasilGabung] = kiri[indexKiri];
                indexHasilGabung++;
                indexKiri++;

            } else if (indexKanan < kanan.length){
                // kalau hanya kanan aja yang masih tersedia
                hasilGabung[indexHasilGabung] = kanan[indexKanan];
                indexHasilGabung++;
                indexKanan++;
            }
        }

        //kembalilkan nilai array penggabungan
        return hasilGabung;

    }

    // Double
    public static void MergeSortDouble (double[] angka){

        System.out.println("\n\n===SEBELUM===");
        for (double a : angka){
            System.out.print(a + " ");
        }

        angka = PemisahanDouble(angka);

        System.out.println("\n===SESUDAH===");
        for (double a : angka){
            System.out.print(a + " ");
        }

    }

    private static double[] PemisahanDouble(double[] angka) {

        // cek apakah sudah satuan atau belum
        if (angka.length <= 1){
            return angka;
        }

        //membuat tempat sisi kiri dan kanan
        int nilaiTengah = angka.length / 2;
        double[] kiri = new double[nilaiTengah];
        double[] kanan;

        if (angka.length % 2 == 0 ){
            kanan = new double[nilaiTengah];
        } else {
            kanan = new double[nilaiTengah + 1];
        }

        // mengisi nilai sisi kiri dan kanan
        for ( int i = 0; i < kiri.length; i++){
            kiri[i] = angka[i];
        }
        for ( int i = 0; i < kanan.length; i++){
            kanan[i] = angka[nilaiTengah + i];
        }

        //lakukan kembali pemecahan sampai sudah menjadi satuan
        kiri = PemisahanDouble(kiri);
        kanan = PemisahanDouble(kanan);

        // membuat tempat tampungan untuk nilai pengembalian penggabungan
        double hasil[] = new double[angka.length];

        //memanggil function penggabungan
        hasil = PenggabunganDouble(kiri, kanan);

        // kembalikan nilai angka yang sudah diubah di proses penggabungan
        return hasil;
    }

    private static double[] PenggabunganDouble(double[] kiri, double[] kanan) {

        // membuat tampungan untuk sisi kiri dan kanan
        double hasilGabung[] = new double[kiri.length + kanan.length];

        // membuat index untuk melakukan pengisian dan pertukaran nilai
        int indexKiri = 0, indexKanan = 0, indexHasilGabung = 0;

        while (indexKiri < kiri.length || indexKanan < kanan.length){

            if (indexKiri < kiri.length && indexKanan < kanan.length){

                if ( kiri[indexKiri] > kanan [indexKanan]){
                    hasilGabung[indexHasilGabung] = kiri[indexKiri];
                    indexHasilGabung++;
                    indexKiri++;

                } else {
                    hasilGabung[indexHasilGabung] = kanan[indexKanan];
                    indexHasilGabung++;
                    indexKanan++;
                }

            } else if (indexKiri < kiri.length){
                hasilGabung[indexHasilGabung] = kiri[indexKiri];
                indexHasilGabung++;
                indexKiri++;

            } else if (indexKanan < kanan.length){
                hasilGabung[indexHasilGabung] = kanan[indexKanan];
                indexHasilGabung++;
                indexKanan++;

            }
        }

        return hasilGabung; // mengembalikan nilai hasilGabung jika sudah sampai tidak ada lagi sisi kanan dan kiri
    }

    //String
    public static void MergeSortString (String[] nama){

        System.out.println("\n\n===Sebelum===");
        for (String n : nama){
            System.out.print(n + " ");
        }

        nama = PemisahanString(nama);

        System.out.println("\n===Sesudah===");
        for (String n : nama){
            System.out.print(n + " ");
        }

    }

    private static String[] PemisahanString(String[] nama) {

        if (nama.length <= 1){
            return nama;
        }

        int nilaiTengah = nama.length / 2;
        String[] kiri = new String[nilaiTengah];
        String[] kanan;

        if ( nama.length % 2 == 0){
            kanan = new String[nilaiTengah];
        } else {
            kanan = new String[nilaiTengah + 1];
        }

        for ( int i = 0; i < kiri.length; i++){
            kiri[i] = nama[i];
        }
        for ( int i = 0; i < kanan.length; i++){
            kanan[i] = nama[nilaiTengah + i];
        }

        kiri = PemisahanString(kiri);
        kanan = PemisahanString(kanan);

        String hasil[] = new String[nama.length];

        hasil = PenggabunganString(kiri, kanan);

        return hasil;
    }

    private static String[] PenggabunganString(String[] kiri, String[] kanan) {

        String hasilGabung[] = new String[kiri.length + kanan.length];

        int indexKiri = 0, indexKanan = 0, indexHasilGabung = 0;

        while (indexKiri < kiri.length || indexKanan < kanan.length){

            if ( indexKiri < kiri.length && indexKanan < kanan.length ){

                if (kiri[indexKiri].compareTo(kanan[indexKanan]) < 0){
                    hasilGabung[indexHasilGabung] = kiri[indexKiri];
                    indexHasilGabung++;
                    indexKiri++;
                } else {
                    hasilGabung[indexHasilGabung] = kanan[indexKanan];
                    indexHasilGabung++;
                    indexKanan++;
                }

            } else if (indexKiri < kiri.length){
                hasilGabung[indexHasilGabung] = kiri[indexKiri];
                indexHasilGabung++;
                indexKiri++;

            } else if (indexKanan < kanan.length){
                hasilGabung[indexHasilGabung] = kanan[indexKanan];
                indexHasilGabung++;
                indexKanan++;
            }


        }

        return hasilGabung;
    }

    public static void MergeSortChar (char[] huruf){

        System.out.println("\n\n===Sebelum===");
        for (char h : huruf){
            System.out.print(h + " ");
        }

        huruf = PemisahanChar(huruf);

        System.out.println("\n===Sesudah===");
        for (char h : huruf){
            System.out.print(h + " ");
        }


    }

    private static char[] PemisahanChar(char[] huruf) {

        if (huruf.length <= 1){
            return huruf;
        }

        int nilaiTengah = huruf.length / 2;
        char[] kiri = new char[nilaiTengah];
        char[] kanan;

        if (huruf.length % 2 == 0){
            kanan = new char[nilaiTengah];
        } else {
            kanan = new char[nilaiTengah + 1];
        }

        for (int i = 0; i < kiri.length; i++){
            kiri[i] = huruf[i];
        }
        for ( int i = 0; i < kanan.length; i++){
            kanan[i] = huruf[nilaiTengah + i];
        }

        kiri = PemisahanChar(kiri);
        kanan = PemisahanChar(kanan);

        char hasil[] =  new char[huruf.length];

        hasil = PenggabunganChar(kiri,kanan);

        return hasil;

    }

    private static char[] PenggabunganChar(char[] kiri, char[] kanan) {

        char hasilGabung[] = new char[kiri.length + kanan.length];

        int indexKiri = 0, indexKanan = 0, indexHasilGabung = 0;

        while ( indexKiri < kiri.length || indexKanan < kanan.length){

            if (indexKiri < kiri.length && indexKanan < kanan.length){

                if (kiri[indexKiri] < kanan[indexKanan]){
                    hasilGabung[indexHasilGabung] = kiri[indexKiri];
                    indexHasilGabung++;
                    indexKiri++;
                } else {
                    hasilGabung[indexHasilGabung] = kanan[indexKanan];
                    indexHasilGabung++;
                    indexKanan++;
                }

            } else if ( indexKiri < kiri.length){

                hasilGabung[indexHasilGabung] = kiri[indexKiri];
                indexHasilGabung++;
                indexKiri++;

            } else if ( indexKanan < kanan.length){

                hasilGabung[indexHasilGabung] = kanan[indexKanan];
                indexHasilGabung++;
                indexKanan++;

            }

        }

        return hasilGabung;

    }

}
