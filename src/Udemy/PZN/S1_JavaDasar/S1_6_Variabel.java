package Udemy.PZN.S1_JavaDasar;

public class S1_6_Variabel {
    public static void main(String[] args) {

        String name;
        name = "Asep Sutisna";

        int age = 19;
        String address = "bogor";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        /*
        Sejak Java versi 10, kita bisa langsung tanpa menuliskan tipe datanya, tetapi syaratnya harus langsung di
        inisialisasi, karena kalau tidak dia akan kebingungan maksud variabel itu tipe datanya apa
                var firstName; // ini akan error
                firstName = "Asep";
         */

        var firstName = "Asep";
        var middleName = "Sutisna";
        var year = 17;

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(year);

        year = 15;
        System.out.println(year);

        // kata kunci final adalah menjadikan nilai itu tetap/constan/tidak bisa berubah-ubah

        final var City = "Indonesia";

        // City = "bogor"; //error karena ada kata kunci final

    }
}
