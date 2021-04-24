package KT;

public class KonversiTipeDataNumeric_11 {
    public static void main(String[] args) {

        //Program konversi data

        int nilaiInt = 450; // 32-bit
        System.out.println("Nilai Int = " + nilaiInt);

        //Memperluas rentang ke tipe data yang lebih besar -> tidak akan masalah
        int nilaiLong = nilaiInt;
        System.out.println("Nilai Long = " + nilaiLong);

        //Memperkecil rentang ke tipe data yang lebih kecil -> akan masalah jika nilainya diluar rentang tipe datanya
        byte nilaiByte = (byte) nilaiInt; // -> teknik casting, untuk konversi ke tipe data byte dulu baru dipindahin ke variabel
        System.out.println("Nilai Byte = " + nilaiByte); // -> error nilai akan muter ke minus
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);

        //Casting pembagian
        // 1. salah satu nya harus ada yang float

        int a = 10;
        float b = 4; //ini dijadikan float

        float c = a / b;
        System.out.printf("%d / %f = %f\n", a, b, c);

        //2. casting dibagian hasil
        int x = 10;
        int y = 4;
        float z = (float) x / y;
        System.out.printf("%d / %d = %f\n", x, y, z);

    }
}
