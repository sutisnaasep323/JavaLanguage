package PetaniKode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProgramBuah {

    //buat objek
    static ArrayList listBuah = new ArrayList();
    static InputStreamReader inputStream = new InputStreamReader(System.in);
    static BufferedReader inputBuff = new BufferedReader(inputStream);
    static boolean isRunning = true;

    public static void main(String[] args) throws IOException {

        do {
            showMenu();
        } while (isRunning);

    }

    static void showMenu() throws IOException{

        System.out.println("====== MENU =======\n" +
                "[1] Tampilkan semua Buah\n" +
                "[2] Masukkan Buah\n" +
                "[3] Edit Buah\n" +
                "[4] Hapus Buah\n" +
                "[5] Keluar Program");
        System.out.print("Pilih Menu : ");

        int selectedMenu = Integer.valueOf(inputBuff.readLine());

        switch (selectedMenu){
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }

    }

    private static void showAllBuah() {

        if (listBuah.isEmpty()){
            System.out.println("Belum ada data buah");
        } else {
            //tampilkan
            for (int i = 0; i < listBuah.size(); i++){
                System.out.println(String.format("[%d] %s",i ,listBuah.get(i)));
            }
        }

    }

    private static void insertBuah() throws IOException{
        System.out.print("Masukkan Nama buah : ");
        String namaBuah = inputBuff.readLine();
        listBuah.add(namaBuah);
        System.out.print("Buah telah ditambahkan..\n");
    }

    private static void editBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomor buah yang ingin diedit : ");
        int indexBuah = Integer.valueOf(inputBuff.readLine());

        System.out.println("Nama buah yang baru : ");
        String buahBaru = inputBuff.readLine();

        //ubah
        listBuah.set(indexBuah, buahBaru);

    }

    private static void deleteBuah() throws IOException{
        showAllBuah();

        System.out.print("Pilih nomor buah yang ingin dihapus :");
        int indexBuah = Integer.valueOf(inputBuff.readLine());

        listBuah.remove(indexBuah);

        System.out.println("Buah telah di hapus..\n");

    }

}
