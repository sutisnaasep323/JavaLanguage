package KT;
import java.lang.StringBuilder;

public class Java_50_StringBuilder {
    public static void main(String[] args) {
        /*
        mempermudah pembuatan string. ini mempermudah kita ketika kalimat dalam string itu ada yang diubah, ditambah delete, dsb
        khususnya ketika berada di tengah kalimat. lalu juga menghemat memori dibandingkan dengan string biasa
         */

        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        /*
        SB punya kapasitas, defaultnya adalah 16 karakter. dengan punya capacity artinya setiap ada kata yang baru maka
        akan masuk kesana (ditambahkan dari kapasitas sebelumnya) berbeda dengan String dia itu akan membuat memory baru
         */

        // OPERASI DI STRING BUILDER
            //1. append = menambahkan kata/kalimat. berbeda dengan concat itu dia menambahkan tetapi dia membuat memory address baru
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Bogor");
        printData(builder);

            //2. Insert = menambahkan kata/kalimat ditengah kalimat dengan menggunakan index
        builder.insert(19, " Kota");
        printData(builder);

            //3. Delete = mendelet sebuah kata/kalimat
        builder.delete(19,24);
        printData(builder);

            //4. Set Character pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

            //5. replace = mengganti sebuah kata/kaliamt
        builder.replace(20,26, "Depok");
        printData(builder);

            //6. Casting to String
        String kalimat = builder.toString();
        int address = System.identityHashCode(kalimat);
        System.out.println(kalimat);
        System.out.println("Address = " + Integer.toHexString(address));

    }


    private static void printData (StringBuilder dataBuilder){
        System.out.println("Data = " + dataBuilder);
        System.out.println("Panjang = " + dataBuilder.length());
        System.out.println("Kapasitas = " + dataBuilder.capacity());

        int addresBuilder = System.identityHashCode(dataBuilder); // cek memory
        System.out.println("Address = " + Integer.toHexString(addresBuilder));

        System.out.println("====================================");

    }


        /*
        kalau kita tes terus menerus (dengan melakukan .append() kpd stringBuild yg kita buat, sepertinya ada pola perpanjangan dengan angka dasar 22 yg terus menerus dikalikan.

        perpanjangan kapasitas pertama: 20 + 22 = 42
        perpanjangan kapasitas kedua: 42 + 22 X 2 = 86
        perpanjangan kapasitas ketiga: 86 + 44 x 2 = 174
        perpanjangan kapasitas keempat: 174 + 88 x 2 = 350
         */
}
