package KT;

public class OperatorUnary_12 {
    public static void main(String[] args) {
        //Unary = operator yang dilakukan pada satu variabel saja

        //Unary + dan -
        int angka = 10;
        System.out.printf("Unary '+', %d menjadi %d\n",angka,+angka);
        System.out.printf("Unary '-', %d menjadi %d\n",angka,-angka);

        //Unary decrement and Increment
        int angka2 = 10;
        angka2++;
        System.out.println("Nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("Nilai dengan '--' menjadi = " + angka3);

        //Prefix, tanda sebelum variabel -> akan dijumlah dulu baru ditampilkan
        int a = 5;
        System.out.printf("Nilai dengan '++' PREFIX menjadi = %d\n",++a );
        //Postfix, tanda setelah variabel -> tampilkan dulu baru dijumlah
        int b = 5;
        System.out.printf("Nilai dengan '++' POSTFIX menjadi = %d\n",b++ );
        System.out.printf("Nilai dengan '++' POSTFIX menjadi = %d\n",b ); // -> hasil penjumlahan

        //Unary boolean dengan ! untuk negasi
        boolean iniBoolean = true;
        System.out.println("nilai boolean = "+ iniBoolean);
        System.out.println("nilai boolean = "+ !iniBoolean); //kebalikan
    }
}
