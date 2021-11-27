package KT;

import java.text.Format;
import java.util.Formatter;

public class Java_51_FormatString {
    public static void main(String[] args) {
        String nama = "Asep Sutisna";
        int umur = 19;

        // Output : Nama saya Asep Sutisna, Umur saya adalah 19

        printLine("Test");
        //biasanya kita menggunakan concate
        System.out.println("Nama saya " + nama + ", Umur saya adalah " + umur);

        // Cara lainnya, kita bisa menggunakan format String
        System.out.printf("Nama saya %s, Umur saya adalah %d\n", nama, umur);

        /*
        1. Conversion:
        * f = floating point
        * s = String
        * d = Integer
        * c = character
        * b = boolean
        * dan masih banyak lagi..(lihat : https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html)

        2. Struktur format:
        ==> %[argumen_index][flags][widht][.precision]conversion <==
         */
        printLine("[argumen_index]");
        /*
         adalah variabel yang terletak dibelakang yang akan menggantikan didalam string itu. daripada berulang
         menambahkan variabel ketika ada data yang sama, kita bisa gunakan dibawah ini
         */

        nama = "udin";
        String nama1 = "asep";
        // 1. Output = udin, wahai udin, kemana saja kamu udin?
        System.out.println("> Contoh 1");
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s ?\n", nama);
        System.out.printf("%s, wahai %s, kemana si %s ?\n", nama, nama, nama1);
        System.out.printf("%s, wahai %s, kemana saja kamu %s?\n", nama, nama, nama); // bukan seperti ini

        System.out.println("> Contoh 2");
        // 2. Output = umur udin berapa? udin menjawab: 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa? \n%1$s menjawab: %2$d \nWah masih muda ya umurnya %2$d\n",nama,umur);

        printLine("[flags]");
        // adalah sebuah tanda, diantaranya adalah tanda (+) untuk menandakan apakah value itu bernilai + / -. flags ini
        // akan terlihat kelakuannya kalau digabungkan dengan [widht]
        /*
        Tanda Flags with widht =
        1. ( + ) --> mengambil slot di dalam format dengan tanda +
        2. ( - ) --> rata kiri
        3. (   ) --> (spasi kosong) menambahkan leading normal ini seperti tanpa flags hanya widht saja
        4. ( 0 ) --> menambahkan leading "0" didepan
        5. ( , ) --> menandakan delimeter per seribu
        6. Flags bisa digabungkan contohnya +-
         */
        int num1 = 5;
        int num2 = 8;
        int hasil = num1 - num2;
        System.out.printf("%d - %d = %+d\n", num1,num2,hasil);

        printLine("[widht]");
        int num3 = 1000;
        System.out.println("> INTEGER");
        System.out.printf("1.)%d\n",num3);
        System.out.printf("2.)%5d\n",num3);  // menambahkan widht/slot sebanyak 5 tanpa flags
        System.out.printf("3.)%-5d\n",num3); // flags = "-", artinya rata kiri dan slotnya ada 5
        System.out.printf("4.)%+5d\n",num3); // flags akan mengambil slot di dalam format dengan tanda +
        System.out.printf("5.)%+6d\n",num3);
        System.out.printf("6.)%+-6d\n",num3); // flags bisa digabungkan. ini rata kiri dan menambahkan flags
        System.out.printf("7.)%10d\n",num3);
        System.out.printf("8.)% 10d\n",num3);
        System.out.printf("9.)%010d\n",num3); // flags = "0", kita tambahkan leading "0" didepan
        System.out.printf("10.)%+010d\n",num3);
        int num4 = 1_000_000_000; //10slot
        System.out.printf("11.)%-,15d\n",num4); // flags = ",", menandakan delimeter per seribu dengan widht 15 sisa 2 slot

        System.out.println("\n> FLOATING POINT");
        //ini itu akan mengambil nilai 6 desimal dibelakang koma dengan total slot 8, artinya ketika kita menambahkan
        //desimal dibawah 6 itu ngga berpengaruh. akan berpengaruh ketika kita menaruh > 8
        float float1 = 1.35f;
        System.out.printf("1.)%f\n", float1);
        System.out.printf("2.)%+9f\n", float1); // kita bisa menambahkan flags seperti diatas

        printLine("[.precision]");
        // adalah mengatur nilai dibelakang koma
        float float2 = 21.542f;
        float float3 = 21.552f;
        System.out.printf("1.)%.1f\n", float2); // dibulatkan kebawah jika nilai < 5 dan menampilkan 1 slot dibelakang koma
        System.out.printf("2.)%.1f\n", float3); // dibulatkan ketas jika nilai >= 5 dan menampilkan 1 slot dibelakang koma

        System.out.printf("3.)%.2f\n", float2); // menampilkan 2 slot dibelakang koma
        System.out.printf("4.)%8.2f\n", float2); // menggabungkan dengan widht
        System.out.printf("5.)%+08.2f\n", float2); // menggabungkan dengan widht dan flag

        printLine("CONTOH");
        String name = "Asep";
        float ipk = 3.4325123134425f;
        System.out.printf("%1$s dapat IPK = %2$+05.2f?\n%1$s : Iya betul!, saya dapat IPK = %2$+05.2f", name, ipk); //posisi,flags (+),flags("0"),widht,precission,conversion

        printLine("Kesimpulan");
        System.out.println("> SAVE TO VARIABLE");
        String info_biasa = "Nama = " + name + ", IPK = " + ipk; // akan mengambil 6 desimal dibelakang koma
        System.out.println(info_biasa);
        String info_format = String.format("Nama = %s, IPK = %+05.2f",name,ipk); // kita bisa simpan ke variabel seperti ini
        System.out.println(info_format);

        System.out.println("> SAVE TO STRING BUILDER");
        //buat object string builder dan formatter untuk memasukkan ke string buildernya
        StringBuilder builder_info = new StringBuilder();
        Formatter format_builder = new Formatter(builder_info);

        format_builder.format(info_format);
        System.out.println(builder_info);

    }

    private static void printLine(String name){
        System.out.printf("\n==============// %s //==============\n", name);
    }
}
