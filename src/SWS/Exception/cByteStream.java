package SWS.Exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class cByteStream {

    public static void main(String[] args) throws IOException {

        //mengambil file txt
        //FileInputStream inputku = new FileInputStream("input3.txt");

        //mengambil file txt beda folder
        FileInputStream inputku = new FileInputStream("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\ByteStream\\input.txt");

        System.out.println(inputku.read()); //menampilkan kode aslinya atu byte nya
        System.out.print((char) inputku.read()); // konversi ke char (ambil kata awalnya)
        System.out.print((char) inputku.read()); // konversi ke char (ambil kata awalnya)
        System.out.print((char) inputku.read()); // konversi ke char (ambil kata awalnya)

        //System.out.println(inputku.available()); //mengambil jumlah karakter

        //read / menampilkan isi file
//        int huruf = inputku.read();
//        while ( huruf != -1 ){ // -1 itu ketika sudah mencapai huruf terakhir. karena baris kosong itu akan menghasilkan -1
//            System.out.print((char) huruf); //konversi ke char
//            huruf = inputku.read();
//        }

        // write file dari file input ke file output
        FileOutputStream outputKu = new FileOutputStream("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\ByteStream\\output.txt");
        // kalau output stream enak, kalau file belum ada bisa langsung ke buat
//        int writeHuruf = inputku.read();
//        while ( writeHuruf != -1 ) {
//            outputKu.write(writeHuruf);
//            writeHuruf = inputku.read();
//        }

        //write menggunakan scanner
//        Scanner inputC = new Scanner(System.in);
//        System.out.print("Masukkan Kalimat : ");
//        String kalimat = inputC.nextLine();
//
//        int kalimatIndex = kalimat.charAt(0); //charAt mengambil karakter pada sebuah String sesuai index
//        int panjangHuruf = kalimat.length();
//        int index = 0;
//
//        while (index < panjangHuruf) {
//            outputKu.write(kalimatIndex);
//            if (index == panjangHuruf-1){
//                break;
//            } else {
//                index++;
//                kalimatIndex = kalimat.charAt(index);
//            }
//        }

        outputKu.close();
        inputku.close(); //jangan lupa di close jika sudah input dan read

    }

}
