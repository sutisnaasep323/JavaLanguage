package SWS.Exception;

import java.io.*;
import java.util.Arrays;

public class cBuffCharStream {

    public static void main(String[] args) throws IOException {

        //Import file
        FileReader inputFile = new FileReader("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\BuffCharStream\\input4.txt");

        //Simpan ke buffered
        BufferedReader buffRead = new BufferedReader(inputFile);

        //tanda/mark
        buffRead.mark(100);

        //buktikan kalau buff char stream itu fokus ke karakter
//        char[] viewFile = new char[17];
//        buffRead.read(viewFile, 0, viewFile.length);

        //tampilkan array viewFile
//        System.out.println(Arrays.toString(viewFile));

        //tampilkan perbaris
        System.out.println(buffRead.readLine());
        System.out.println(buffRead.readLine());

        //reset si buffread agar kembali ke awal
        buffRead.reset();

        // mengkoneksi fileOutput
        FileWriter fileOutput = new FileWriter("E:\\AS\\Yummi\\ENTREPRENEURSHIP\\Java Language\\studyWithStudent\\stream\\BuffCharStream\\output4.txt");

        //simpan ke buff
        BufferedWriter buffOutput = new BufferedWriter(fileOutput);

        //Write dari fileInput ke fileOutput
        String baris1 = buffRead.readLine();
        buffOutput.write(baris1, 0, baris1.length());
        buffOutput.flush();

        //tambah baris baru biar ngga nempel baris 1 dan 2
        buffOutput.newLine();

        String baris2 = buffRead.readLine();
        buffOutput.write(baris2, 0, baris2.length());
        buffOutput.flush();

        //tutup
        inputFile.close();
        buffRead.close();
        fileOutput.close();
        buffOutput.close();

    }

}
