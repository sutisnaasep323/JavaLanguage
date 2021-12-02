package Udemy.PZN.JavaDasar;

public class S1_8_Array {
    public static void main(String[] args) {

        //Deklarasi Array
        //1
        int[] array;
        array = new int[2];
        //2
        int[] array1 = new int[] {
                12,53,7
        };
        //3
        int[] array2 = {
                10,21,5
        };

        //Panggil array
        //1
        array[0] = 3;
        array[1] = 2;
        System.out.println(array[0]);
        System.out.println(array[1]);

        System.out.println();
        //2
        System.out.println(array1[1]);
        //3
        System.out.println(array2[1]);

        System.out.println();

        //panjang array
        System.out.println(array2.length);

        //mengubah data array, sebenarnya ini hanya di manipulasi
        array[1] = 10;
        System.out.println(array1[1]);

        array1[0] = 0;
        System.out.println(array1[0]);

        String[] nama = { "Abu Hammad", "Asep", "Sutisna"};
        System.out.print(nama.length);
        nama[0] = "Hammad";
        nama[2] = null;
        System.out.println(nama[0]);
        System.out.println(nama[2]);

        //nested array

        String[][] anggota = {
                {"Asep", "Yumi"},
                {"Humazah", "Rizaldi", "Edo"},
                {"Keisya"}
        };

        System.out.println(anggota[1][2]);

    }
}
