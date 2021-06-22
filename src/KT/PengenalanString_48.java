package KT;

import java.util.Arrays;

public class PengenalanString_48 {
    public static void main(String[] args) {

            //Membuat String
        String kataString = "Hallo - hallo Bandung";
        char[] kataChar = {'h', 'a', 'l', 'l', 'o'};

            //Menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

            //Mengakses komponen dari String
        System.out.println("Komponen pertama dari String = " + kataString.charAt(3));
        System.out.println("Komponen pertama dari Char = " + kataChar[3]);


            //Merubah komponen char
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        printAddress("kataString",kataString);

            /*
            Merubah komponen dari String, ini tidak bisa, karena di java  itu immutable
            (tidak bisa dirubah / hanya di read saja)
             */

//        kataString[0] = "c"; <--- tidak bisa
//        kataString.charAt(0) = "c"; <--- tidak bisa

        // tapi kita bisa merubah komponen secara tidak langsung
        kataString = "c" + kataString.substring(1,5); // menggunakan substring, artinya mengambil kata dari index pertama sampai 5, dan 5 disini tidak dianggap
        System.out.println(kataString);

            // memory dari string (String Pool)

        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";


        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3",str_3);

        String str_4 = "callo";
        printAddress("str_4",str_4);

        kataString = "callo";
        printAddress("kataString",kataString);

        // 1. String di java itu immutable
        // 2. String yang berada di string pool itu akan reuseable, memorynya lebih
        // efisien
        // 3. membuat string dengan method baru, maka dia akan ditaro di memory lain
        // bukan di string pool


        // liat lebih dalam

        String a = new String("hallo");
        printAddress("a",a);

    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
