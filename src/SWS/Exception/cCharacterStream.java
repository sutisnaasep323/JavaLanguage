package SWS.Exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cCharacterStream {

    public static void main(String[] args) throws IOException {

        //menarik atau mengimport file
        FileReader inputku = new FileReader("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\CharacterStream\\input2.txt");

        //menampilkan beberapa isi file
//        System.out.print((char) inputku.read());
//        System.out.print((char) inputku.read());
//        System.out.print((char) inputku.read());
//        System.out.print((char) inputku.read());
//        System.out.print((char) inputku.read());

        // menampilkan semua isi file
        int huruf = inputku.read();
        while ( huruf != -1 ){ // -1 itu ketika sudah mencapai huruf terakhir. karena baris kosong itu akan menghasilkan -1
            System.out.print((char) huruf); //konversi ke char
            huruf = inputku.read();
        }

        //write kalimat ke file output
        FileWriter outputku = new FileWriter("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\CharacterStream\\output2.txt");
        int writeHuruf = inputku.read();

        while (writeHuruf != -1){
            outputku.write(writeHuruf);
            writeHuruf = inputku.read();
        }


        inputku.close();
        outputku.close();
    }

}
