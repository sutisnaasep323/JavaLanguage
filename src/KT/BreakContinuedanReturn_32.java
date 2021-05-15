package KT;

public class BreakContinuedanReturn_32 {
    public static void main(String[] args) {

        int a = 0;

        while (true) {

            a++; // ini dipindahkan ke sini karena ada keyword continue agar program tetap dieksekusi sesuai yang diinginkan
            if (a == 10) {
                break; // keyword untuk memaksa keluar dari loop
            } else if (a == 5){
                continue; // keyword untuk memaksa memulai aksi dari awal. ini tuh akan skip yang bawah dan mulai dari atas
            } else if (a == 7){
                return; // return = menghentikan program
            }

            System.out.println("Loop ke - " + a);
        }

        System.out.println("=== Akhir program ===");

    }
}
