package SWS.Exception;

import java.io.*;
import java.util.Arrays;

public class cBuffByteStream {

    public static void main(String[] args) throws IOException {

         // Mengimport File
        FileInputStream fileInput = new FileInputStream("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\BuffByteStream\\input3.txt");

        //tampung ke buffered
        BufferedInputStream buffInput = new BufferedInputStream(fileInput);

        // siapkan variabel dengan type data byte untuk menampilkan semua isi dari buffInput
        byte[] viewFile = buffInput.readAllBytes();
        //tampilkan ke console
//        for (int i = 0; i < viewFile.length; i++){
//            System.out.print((char) viewFile[i]);
//        }
        System.out.print(Arrays.toString(viewFile)); // konvert ke string hasilnya adalah data byte nya / hmm masih kurang paham juga sih

        // menghubungkan aplikasi ke fileOutput (mengkoneksikan file output)
        FileOutputStream fileOutput = new FileOutputStream("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\BuffByteStream\\output3.txt");

        //file output ditampung ke Buffered output stream
        BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);

        buffOutput.write(viewFile); //menyimpan isi fileOutput ke dalam memori write
        buffOutput.flush(); //write output buffered

        // closes
        fileInput.close();
        buffInput.close();
        fileOutput.close();
        buffOutput.close();

    }

}
