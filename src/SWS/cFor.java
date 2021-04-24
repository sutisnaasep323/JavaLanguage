package SWS;

public class cFor {

    public static void main(String[] args) {

        int nilaiAwal;

        short batas = 10;

        // 1 sampai n
//        for (nilaiAwal = 1; nilaiAwal <= batas; nilaiAwal++){
//            System.out.println(nilaiAwal);
//        }

        // n sampai 1
        for (nilaiAwal = batas; nilaiAwal >= 1; nilaiAwal--){
            System.out.println(nilaiAwal);
        }
        System.out.println("------\n" + nilaiAwal);

        /*
        melakukan FOR dengan menset nilai N dengan variabel nilaiAwal adalah 10. lalu melakukan pengecekan apakah 10 <= 1?
        Ya, maka print nilai 10 lalu nilaiAwal di kurang menjadi 9..0 . kemudian apakah 0 <= 1? tidak, maka for berhenti
         */

        for (int nama = 0; nama < 3; nama++){
            System.out.println("Asep Sutisna");
        }
    }

}
