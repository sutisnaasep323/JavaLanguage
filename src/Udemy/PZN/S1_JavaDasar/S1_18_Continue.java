package Udemy.PZN.S1_JavaDasar;

public class S1_18_Continue {
    public static void main(String[] args) {

        for (var counter = 1; counter <= 20; counter++){
            if ( counter % 2 == 1){ // cetak angka genap, kalau ganjil ubah 1 menjadi 0
                continue;
            }

            System.out.println("Perulangan " + counter);
        }

    }
}
