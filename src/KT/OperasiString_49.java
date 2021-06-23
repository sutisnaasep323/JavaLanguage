package KT;

import java.util.Locale;
import java.util.Scanner;

public class OperasiString_49 {
    public static void main(String[] args) {

        String kalimat = "Saya suka makan pisang";

        // Mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);

        // concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata = kata + " cireng";
        System.out.println(kata);

        // concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; // casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        //replace
        String kalimat4 = kalimat.replace("pisang", "mangga");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        //ketika string di cek sama atau tidak  pada dasarnya itu yang di bandingkan adalah addressnya bukan valuenya, agar bisa membandingkan valuenya maka menggunakan equals (agar string itu berada di string pool)
        //ketika kita mengambil string dari user maka itu Heap bukan dari StringPool, agar bisa menjadi stringpool harus pakai equals

        // equality ( persamaan )

        String kataInput = "test"; // ini ada di string pool
//        String kataInput = new String("test"); // ini bukan string literal, dan tidak berada di string pool
        String kataTest = "test"; // ini juga ada di string pool

        System.out.println("\npersamaan pada lokasi string pool");
        if (kataInput == kataTest){
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("\nmengambil input string dari user: ");
        kataInput = userInput.next(); // tidak di string pool
        System.out.println("ini adalah input user: " + kataInput);

        if (kataInput.equals(kataTest)){ // apakah katainput sama dengan katatest?
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        // Ketika ingin membandingkan(compare) string itu dia membandingkan urutan alfabet

        // Compare
        String motor1 = "royal enfield himalayan";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2)); // klmnopqr (jaraknya 7) dari k -> r
        System.out.println(motor2.compareTo(motor1)); // motor 2 lebih besar dari motor 1

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2)); // gorengan1 lebih besar dari gorengan2
        System.out.println(gorengan2.compareTo(gorengan1)); // gorengan2 lebih kecil dari gorengan1


    }

}
