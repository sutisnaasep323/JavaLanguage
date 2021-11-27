package Udemy.PZN.JavaDasar;

public class S1_2_KonversiNumber {
    public static void main(String[] args) {

        // otomatis
        byte varByte = 10;
        short varShort = varByte;
        int varInt = varShort;

        // Manual
        int varInt2 = 1000;
        short varShort2 = (short) varInt2; // dipaksa dengan menambahkan nama tipe data yang ingin di konversi

        /*
        Hati-hati ketika ingin konversi dari tipe data yang besar ke yang kecil jika datanya melebihi kapasitas
        maka akan terjadi number overflow. alhasil jika sudah mencapai angka di titik maksimal maka akan berputar
        sampai value terpenuhi
         */

    }
}
