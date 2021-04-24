package SWS;

public class BinarySearch { //binary search harus urut dulu datanya

    public static void main(String[] args) {

        int nilaiRaport[] = {77, 78, 80, 85, 90, 95, 99};
        int key = 90;
        BinarySearchInt(nilaiRaport, key);

        String nama[] = {"Asep", "Budi", "Chika", "Desi", "Hani"};
        BinarySearchString(nama, "asep");

    }

    private static void BinarySearchInt(int[] nilaiRaport, int search) {

        int bawah = 0, atas = nilaiRaport.length-1, tengah;
        boolean status = false;

        while ( bawah <= atas){
            tengah = (bawah + atas) / 2;
            if (nilaiRaport[tengah] == search){
                System.out.println("Nilai " + search + " Ditemukan pada posisi " + (tengah+1));
                status = true;
                break;
            }

            else {
                if (search > nilaiRaport[tengah]){
                    bawah = tengah + 1;
                } else {
                    atas = tengah - 1;
                }
            }
        }

        if ( status == false){
            System.out.println("Nilai " + search + " tidak ditemukan!");
        }

    }

    public static void BinarySearchString(String[] kata, String key){

        int low = 0, high = kata.length-1, med;
        boolean status = false;

        while (low <= high){

            med = (low + high) / 2;

            //pengecekan apakah datanya ditemukan atau tidak
            if (key.equalsIgnoreCase(kata[med])){
                //kalo ketemu
                System.out.println("Nama " + key + " Telah ditemukan pada posisi " + (med+1) + " pada index ke" + med);
                status = true;
                break;
            } else {
                //kalo tidak
                // lakukan pembagian array apakah lebih besar atau kecil dari key
                if (key.compareToIgnoreCase(kata[med]) > 0){
                    low = med + 1;
                } else {
                    high = med - 1;
                }
            }

        }

        // kalau tidak ditemukan
        if (status == false){
            System.out.println("Nama " + key + " tidak ditemukan!");

        }

    }

}
