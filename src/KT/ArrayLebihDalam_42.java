package KT;

import java.util.Arrays;

public class ArrayLebihDalam_42 {

    public static void main (String[] args){

        /*
        Array itu menggunakan memory Heap (tidak berurutan/sembarang) sehingga ini mempunyai lokasi memory. ketika
        array disamakan maka dia akan mempunyai satu memory array agar menghemat memory sebagaimana contoh dibawah ini
         */

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        //before -> beda memory
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        //disamakan, ini bukan mencopy/memberikan nilai tapi memindahkan addressnya (memberikan reference/addressnya)
        arrayAngka2 = arrayAngka1;

        //after -> memory menjadi sama
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        //ketika salah satunya diubah maka variabel lain akan ikut berubah, karena ini sebenarnya satu memory
        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        /*
        dengan kelakukan array seperti ini kita harus hati-hati ketika kita membuat function yang ingin mengubah
        data array maka perhatikan, bahwa array itu memindahkan address artinya kalau kita ubah salah satunya maka
        akan mengubah keduanya. karena hal ini ini menunjuk address yang sama
         */

        ubahArray(arrayAngka1);
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2)); //array 2 ikut berubah
    }
    // method yang argumentnya adalah reference, pass by reference (kalau istilah C)
    // bukan pass by value

    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }
}
