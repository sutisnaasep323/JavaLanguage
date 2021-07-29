package KT;

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
        // 1. Output = udin, wahai udin, kemana saja kamu udin?
        System.out.println("> Contoh 1");
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s ?\n", nama);
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


    }

    private static void printLine(String name){
        System.out.printf("\n==============// %s //==============\n", name);
    }
}
