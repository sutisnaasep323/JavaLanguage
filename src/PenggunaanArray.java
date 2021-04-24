import java.util.Scanner;

public class PenggunaanArray {

    public static void main(String[] args) {
        Scanner tulis = new Scanner(System.in);
        String [] namanya = new String[6];
        String nama;
        int jumlahNama=0;
        int i=0;
        int urut=0;
        boolean kondisi;
        while(jumlahNama < namanya.length) {
//            do {
//                kondisi=true;
//                System.out.print("Masukkan nama yang berbeda ke-"+(jumlahNama+1)+" : ");
//                nama = tulis.nextLine();
//                while(i<jumlahNama) {
//                    if(nama.equalsIgnoreCase(namanya[i])) {
//                        System.out.println("Maaf,nama sudah Tersedia");
//                        kondisi = false;
//                        break;
//                    }
//
//                    i++;
//                }
//            } while(!kondisi);
//            namanya[jumlahNama] = nama;
//            jumlahNama++;

            for (i = 0; i < namanya.length; i++) {
                kondisi=true;
                System.out.print("Masukkan nama yang berbeda ke-" + (jumlahNama + 1) + " : ");
                nama = tulis.nextLine();
                while (i < jumlahNama) {
                    if (nama.equalsIgnoreCase(namanya[i])) {
                        System.out.println("Maaf,nama sudah Tersedia");
                        kondisi = false;
                        break;
                    }
                }
                while(!kondisi);
                namanya[jumlahNama] = nama;
                jumlahNama++;
            }
        }

        tulis.close();
        System.out.println("\nNama-nama yang tertera yaitu:");
        for(String daftarNama: namanya ){
            urut++;
            System.out.println((urut)+". "+daftarNama);
        }
    }

}
