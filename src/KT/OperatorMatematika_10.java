package KT;

public class OperatorMatematika_10 {
    public static void main(String[] args) {
        int variabel1 = 10;
        int variabel2 = 5;
        int hasil;

        // Operasi Aritmatika

        //1.Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        //2.Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d\n",variabel1,variabel2,hasil);

        //3.Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d\n",variabel1,variabel2,hasil);

        //4.Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d : %d = %d\n",variabel1,variabel2,hasil);

        //Tipe data itu menentukan hasilnya. jika ingin koma maka jangan pakai integer
        float a = 11;
        float b = 2;
        float hasilFloat;
        hasilFloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        //5.Modulus (Sisa bagi)
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d\n",variabel1,variabel2,hasil);
    }
}
