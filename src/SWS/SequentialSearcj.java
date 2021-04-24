package SWS;

import java.util.Scanner;

public class SequentialSearcj {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INTEGER

        int[] absen = {6,5,2,3,7,8,7,10};

        System.out.println("Nomor absen siswa yang hadir : " );
        for (int i = 0; i < absen.length; i ++){
            System.out.print(absen[i] + " ");
        }

        System.out.print("\nMasukkan pencarian : ");
        int search = input.nextInt();

        SequentialSearchInt(absen,  search);

        System.out.println();

        // STRING

        String nama[] = {"Asep", "Budi", "Joko", "Yumi", "Hammad"};
        System.out.println("Nama-nama yang hadir : " );
        for (int i = 0; i < nama.length; i ++){
            System.out.print(nama[i] + " ");
        }

        System.out.print("\nMasukkan Pencarian : ");
        String cari = input.next();

        SequentialSearchString(nama, cari);

    }


    private static void SequentialSearchInt(int[] absenn, int searchh) {

        boolean status = false;

        for ( int i = 0; i < absenn.length ; i++){

            if (absenn[i] == searchh){
                System.out.println( "Absen "+ searchh + " hadir. tadi setelah absen ke " + i + " pada posisi ke-" + (i+1));
                status = true;
                break; //ketika ketemu menghentikan perulangan
            }

        }

        if ( status == false ) {
            System.out.println("Abesen " +  searchh + " tidak ada diabsen ");
        }

    }

    // STRING

    private static void SequentialSearchString(String[] nama, String cari) {

        boolean status = false;

        for (int i = 0; i < nama.length; i++){

            if (nama[i].equalsIgnoreCase(cari)){
                System.out.println(nama[i] + " Hadir...");
                status = true;
                break;
            }

        }

        if (status == false){
            System.out.println("Nama " + cari + " Tidak ditemukan");
        }

    }


}
