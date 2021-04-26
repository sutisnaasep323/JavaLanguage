package KT;

public class ForLoop_29 {
    public static void main(String[] args) {
//        for (inisialisasi; kondisi; step nilai){
//
//            aksi;
//
//        }


        System.out.println("ini adalah awal program");

        System.out.println("loop pertama");

        for(int nilai = 0; nilai <= 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }


        System.out.println("loop kedua");

        for(int nilai = 0; nilai < 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop ketiga");

        for(int nilai = 10; nilai >= 5 ; nilai--){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop keempat");

        int nilai = 0;

        for(; nilai < 10 ;){ //kita bisa melakukan perulangan minimal dengan kondisi

            System.out.println("for loop ke-" + nilai);
            nilai++; // step ini bisa dibawah
        }

        System.out.println("ini adalah akhir program");

    }
}
