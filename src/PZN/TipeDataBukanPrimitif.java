package PZN;

public class TipeDataBukanPrimitif {

    public static void main(String[] args) {


        // Java itu menggunakan tipe data bukan primitif (Objek)


        Integer iniInteger = 1000;
        //Integer iniInteger; -> akan error kalau tidak diinisialisasi
        System.out.println(iniInteger);

        Byte iniByte = 79;
        System.out.println(iniByte);

        // cara konversi

            //dari primitif ke objek
        int uang = 10_000;

        Integer uang2 = uang;
        System.out.println(uang2);

            // dari objek ke primitif
        int uang3 = uang2;
        System.out.println(uang3);

            // dari objek ke primitif berbeda tipe data
        float uang4 = uang2.floatValue();
        double uang5 = uang2.doubleValue();
        short uang6 = uang2.shortValue();

        System.out.println(uang4);
        System.out.println(uang5);
        System.out.println(uang6);

    }

}
