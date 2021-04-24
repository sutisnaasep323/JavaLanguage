import java.util.Scanner;

public class Soal3 {

    public static class Mahasiswa {
        public String nama;
        public int nim;
        public String jenisKelamin;
        public double ipk;

        public Mahasiswa(){
            String n;
            int nm;
            String jk;
            double ip;
        }
        public double rataRata(){
            return ipk;
        }
    }

    public static class MahasiswaMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double rataRata = 0;
            Mahasiswa[] mArray;
            System.out.print("Masukkan jumlah data mahasiswa : ");
            int n = sc.nextInt();
            mArray = new Mahasiswa[n];
            System.out.println("");

            for(int i = 0; i < mArray.length; i++){
                mArray[i] = new Mahasiswa();
                System.out.println("Masukkan data mahasiswa ke - " + (i+1));
                System.out.print("Masukkan nama : ");
                mArray[i].nama = sc.next();
                System.out.print("Masukkan nim : ");
                mArray[i].nim = sc.nextInt();
                System.out.print("Masukkan jenis kelamin : ");
                mArray[i].jenisKelamin = sc.next();
                System.out.print("Masukkan IPK : ");
                mArray[i].ipk = sc.nextDouble();
                System.out.println("");
            }
            for(int i = 0; i < mArray.length; i++){
                System.out.println("Data Mahasiswa ke - " + (i+1));
                System.out.println("Nama : " + mArray[i].nama);
                System.out.println("NIM : " + mArray[i].nim);
                System.out.println("Jenis Kelamin : " + mArray[i].jenisKelamin);
                System.out.println("Nilai IPK : " + mArray[i].ipk);
                System.out.println("");
            }

            for (int i = 0; i < mArray.length; i++){
                rataRata = rataRata + mArray[i].ipk;
            }

            double rataRataIPK = rataRata / mArray.length;

            System.out.println("--------------------------------------------------");
            System.out.print("Rata-rata IPK nya adalah " + rataRataIPK);

        }
    }

}
