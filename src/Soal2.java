import java.util.Scanner;

public class Soal2{
    public static void main(String[] args) {
        // TODO code application logic here
        int tinggibadan;
        int beratbadan;
        int jeniskelamin;


        Scanner s = new Scanner(System.in);

// Softcode inputan tinggi badan user yang akan menggunakan program
        System.out.println("Masukkan angka tinggi badan (cm):");
        tinggibadan = s.nextInt();


// Softcode inputan berat badan user yang akan menggunakan program
        System.out.println("Masukkan angka berat badan (kg)\t:");
        beratbadan = s.nextInt();


// Softcode inputan jenis kelamin user yang akan menggunakan program
        System.out.println("Masukkan jenis kelamin anda dengan menggunakan option dibawah ini");
        System.out.println("Pilihan untuk jenis kelamin:1.Laki - laki dan 2.Perempuan");
        jeniskelamin = s.nextInt();

        int bbilaki= (int) ((tinggibadan-100)- ((tinggibadan-100)*0.1));
        int bbiperempuan = (int) ((tinggibadan-100)-((tinggibadan-100)*0.15));

        if (jeniskelamin == 1) {

            System.out.println("hasil dari perhitungan bbi anda (Laki - laki)=\t"+bbilaki);
            if (beratbadan < bbilaki){
                System.out.println("Berat badan tidak ideal");
            }

        } else if ( jeniskelamin == 2) {

            System.out.println("Hasil dari perhitungan bbi anda (Perempuan)=\t"+bbiperempuan);
            if (beratbadan < bbiperempuan){
                System.out.println("Berat badan tidak ideal");
            }

        } else {
            System.out.println("Masukkan jenis kelamin dengan benar");
        }



    }

}