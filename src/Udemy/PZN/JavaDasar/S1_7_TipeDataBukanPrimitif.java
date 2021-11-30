package Udemy.PZN.JavaDasar;

public class S1_7_TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Primitif = tipe data bawaan dalam bahasa pemrograman yang punya default value (int, char, byte, short, dll)
        // Bukan Primitif (Objek) = tipe data yang tidak punya default value

        // Java itu seharusnya menggunakan tipe data bukan primitif (Objek) karena java adalah OOP
        // 1. yang memiliki default value NULL, berbeda dengan Tipe data primitf dia mempunya default value
        // 2. Mempunyai function/method
        // 3. Huruf pertamanya besar kecuali int itu menjadi Integer


        Integer iniInteger = 1000;
        //Integer iniInteger; -> akan error kalau tidak diinisialisasi lalu langsung di print karena nilainya null
        //Integer iniInteger2 = null; -> ini boleh dikasih default value
        System.out.println(iniInteger);

        Byte iniByte = 79;
        System.out.println(iniByte);

        // cara konversi

        //1. dari primitif ke yang bukan primitif (objek)
        int uang = 10_000;

        Integer uang2 = uang;
        System.out.println(uang2);

        //2. dari yang bukan primitif (objek) ke primitif
        int uang3 = uang2;
        System.out.println(uang3);

        //3. dari yang bukan primitif (objek) ke primitif berbeda tipe data
        float uang4 = uang2.floatValue();
        double uang5 = uang2.doubleValue();
        short uang6 = uang2.shortValue();

        System.out.println(uang4);
        System.out.println(uang5);
        System.out.println(uang6);

    }
}
