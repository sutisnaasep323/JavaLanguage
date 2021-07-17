package KT;

import java.util.Arrays;

public class ArrayMultiDimensi_LebihDalam_46 {

    /*
    Mengapa array di java komponennya itu bisa disatukan walau size nya berbeda?

    Intinya, array di java itu menggunakan array sebagai objek. sehingga ketika membuat array komponen di java
    itu membuat memori baru. berbeda dengan C++ dia itu tidak menjadikan array sebagai objek, sehingga memori di
    dalamnya bersambung (memorinya sama) jika demikian maka size nya pun harus sama.
     */

    public static void main(String[] args) {
        int[][] array_2D = {
                {1,2,3},
                {4,5},
        };

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);

        System.out.println(Arrays.deepToString(array_2D));
        System.out.print("\n");

        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e'};

        char[][] arrayChar_2D = {
                array_char1,
                array_char2,
        };

        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));

    }

}
