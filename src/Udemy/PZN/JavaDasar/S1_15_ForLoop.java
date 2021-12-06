package Udemy.PZN.JavaDasar;

public class S1_15_ForLoop {
    public static void main(String[] args) {

        // (init statement ; kondisi ; post statement) itu opsional. kalau tidak diisi berarti true

        //For tanpa 3 hal
//        for (;;){
//            System.out.println("Perulangan tanpa henti");
//        }
        // Note : hati-hati jika buat program yang seperti diatas karena akan membuat stuck (tidak akan mengeksekusi kode dibawahnya)

        //For dengan kondisi
//        var counter = 1;
//
//        for (; counter <= 10;){
//            System.out.println("Perulangan ke-" + counter);
//            counter++;
//        }

        //For dengan kondisi + init statement
//        for (var counter = 1; counter <= 10;){
//            System.out.println("Perulangan ke-" + counter);
//            counter++;
//        }

        //For dengan init statement + kondisi + post statement
        for (var counter = 1; counter <= 10; counter++){
            System.out.println("Perulangan ke-" + counter);
        }

    }
}
