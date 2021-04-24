package SWS.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cStringTokenizer {

    public static void main(String[] args) throws IOException {

        //Import File
        FileReader inputFile = new FileReader("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\StringToken\\input5.txt");

        //tampung ke buff
        BufferedReader buffInput = new BufferedReader(inputFile);

        buffInput.mark(350);

        //Scanner
        Scanner inputSc = new Scanner(buffInput);
//        String kata = inputSc.next();
//        System.out.println(kata);
//        kata = inputSc.next(); // untuk mengambil kata selanjutnya
//        System.out.println(kata);
            //cara singkat
//        System.out.println(inputSc.hasNext());
//        System.out.println(inputSc.next());
//        System.out.println(inputSc.next());
//        System.out.println(inputSc.next());
//        System.out.println(inputSc.next());
//        //System.out.println(inputSc.next()); //error karena kata sudah habis
//        System.out.println(inputSc.hasNext()); // dengan adanya nilai true dan false kita bisa buat perulangan

        // mengambil kata melalui scanner
        inputSc.useDelimiter(", "); // pakai delimiter (pemisah)
        while ( inputSc.hasNext()) {
            System.out.println(inputSc.next());
        }

        //reset
        buffInput.reset();

        System.out.println();

        //String Tokenizer = mengambil kata perbaris bukan semuanya seperti scanner
        String baris = buffInput.readLine();
        StringTokenizer stringToken = new StringTokenizer(baris);
        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        baris = buffInput.readLine();
        stringToken = new StringTokenizer(baris, " | ");
        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }


        //tutup
        inputSc.close();
        inputFile.close();
        buffInput.close();

    }

}
