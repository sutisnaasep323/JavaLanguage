package SWS.Exception;

public class cException {
    // Exception digunakan untuk menangani potongan program yang berpotensi error. agar tidak berimbas kepada program
    // dibawahnya sehingga dibawahnya tetap diekseskusi

    public static void main(String[] args) {

        int bilangan[] = {5,3,2,6,1,9};

        try { // cobain program
            System.err.println(bilangan[7]);
        } catch (ArrayIndexOutOfBoundsException pesan){ // semua exception masuk ke dalam variabel 'pesan' lalu akan ditampilkan
            System.out.println(pesan); // catch nya bisa banyak tergantung kebutuhan
        } finally { // keyword yang diakhir try and catch. mau ada error atau tidak maka program dalam finally tetap dikerjakan
            System.out.println("Ini adalah finally");
        }

        System.out.println("Akhir program");

        //atau menggunakan throws yaitu disamping methodnya
        //     public static void main(String[] args) throws Exception {

    }


}
