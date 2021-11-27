
import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        /*String nama;
        int nilai, point, jml;*/
        Scanner input = new Scanner(System.in);
        int jml = 3;

        System.out.println("Kandidat Siswa Berprestasi");
        String nama[]=new String[jml];
        int nilai[] = new int[jml];
        int point[] = new int[jml];


        for (int i=0; i<jml; i++){
            System.out.print("Nama : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai akhir rata-rata :");
            nilai[i] = Integer.parseInt (input.nextLine());
            System.out.print("Point Pelanggaran : ");
            point[i] = Integer.parseInt (input.nextLine());

            if(nilai[i]>=95 && point[i] == 0){
                System.out.println(nama[i] + " Mendapatkan beasiswa 100%");
            }else if (nilai[i]>=90 && point[i]<=4){
                System.out.println(nama[i] + " Mendapatkan beasiswa 50%");
            }
            System.out.println();
        }

    }
}