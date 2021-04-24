package SWS;

public class SelectionSort {

    public static void main(String[] args) {

        int nilai[] = {53, 64, 87, 32, 12, 89};
        IntSelectionSortDSC(nilai);

        double ipk[] = {3.2, 2.5, 4.0, 1.8, 2.6};
        DoubleSelectionSortASC(ipk);

        String hewan[] = {"Kucing", "Ayam", "Domba", "Zebra", "Bebek", "Ikan"};
        StringSelectionSortDSC(hewan);

        char karakter[] = {'n', 'b', 'F', 'y', '4', '3', 'E', '$', '*', '@', '9'};
        CharSelectionSortASC(karakter);

    }

    /*
    - index i = 0, jika 0 < nilai (6) bernilai true, maka set variabel Saatini = i (0)
    - lakukan for j = index variabel i (0). jika 0 < nilai (6) bernilai true, maka lakukan if
    - jika variabel saatIni < bilangan[j] (0 = 53). maka simpan index bilangan[j = 0] itu pada variabel saatIni -> 53
    - melakukan pengecekan untuk mencari nilai terbesar jika sudah sampai akhir maka nilai tersebut pada index i = 0
    akan ditukar
    - kemudian akan memulai kembali pada index i selanjutnya.
     */

    public static void IntSelectionSortDSC ( int[] bilangan){

        System.out.println("===Sebelum===");
        for ( int b : bilangan){
            System.out.print(b + " ");
        }

        for ( int i = 0; i < bilangan.length; i++){

            int saatIni = i;
            for ( int j = i; j < bilangan.length; j++){

                // jika lebih besar dari bilangan saat ini maka ditukar
                if (bilangan[saatIni] < bilangan[j]){
                    saatIni = j;
                }

            }

            // Swap
            int tampungan = bilangan[i];
            bilangan[i] = bilangan[saatIni];
            bilangan[saatIni] = tampungan;

        }

        System.out.println("\n===Sesudah===");
        for ( int b : bilangan){
            System.out.print(b + " ");
        }

    }


    public static void DoubleSelectionSortASC (double bil2[]){

        System.out.println("\n\n===Sebelum===");
        for ( double b2 : bil2){
            System.out.print(b2 + " ");
        }

        for (int i = 0; i < bil2.length; i++){

            int saatIni = i;
            for ( int j = i; j < bil2.length; j++){

                if ( bil2[saatIni] > bil2[j]){
                    saatIni = j;
                }

            }

            // Swap
            double tampungan = bil2[i];
            bil2[i] = bil2[saatIni];
            bil2[saatIni] = tampungan;

        }


        System.out.println("\n===Sesudah===");
        for ( double b2 : bil2){
            System.out.print(b2 + " ");
        }

    }

    public static void StringSelectionSortDSC (String kata[]){

        System.out.println("\n\n===Sebelum===");
        for ( String k : kata){
            System.out.print(k + ", ");
        }

        for ( int i = 0; i < kata.length; i++){

            int saatIni = i; //data awal

            for ( int j = i; j < kata.length; j++){

                if ( kata[saatIni].compareTo(kata[j]) < 0){
                    saatIni = j; // data yang sudah fix ketika semua selesai pengecekan
                }

            }

            String tampungan = kata[i];
            kata[i] = kata[saatIni];
            kata[saatIni] = tampungan;

        }



        System.out.println("\n===Sesudah===");
        for ( String k : kata){
            System.out.print(k + ", ");
        }

    }

    public static void CharSelectionSortASC (char huruf[]){

        System.out.println("\n\n===Sebelum===");
        for ( char h : huruf){
            System.out.print(h + ", ");
        }

        for (int i = 0; i < huruf.length; i++){

            int saatIni = i;
            for ( int j = i; j < huruf.length; j++){

                if ( huruf[saatIni] > huruf[j]){
                    saatIni = j;
                }

            }

            char tampungan = huruf[i];
            huruf[i] = huruf[saatIni];
            huruf[saatIni] = tampungan;

        }

        System.out.println("\n===Sesudah===");
        for ( char h : huruf){
            System.out.print(h + ", ");
        }

    }

}
