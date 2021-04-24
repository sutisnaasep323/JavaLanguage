package SWS;

public class InsertionSort {

    public static void main(String[] args) {

        int nilai[] = {42, 62, 37, 86, 21, 90};
        IntSelectionSortDSC(nilai);

        double ipk[] = {2.5, 1.2, 3.2, 2.4, 4.0, 1.8};
        DoubleInsertionSortASC(ipk);

        char karakter[] = {'1', '&', 'e', 'R', 'i', 'a', 'p', '3', '#'};
        CharInsertionSortDSC(karakter);

        String nama[] = {"Asep", "Abdullah", "Zahid", "Hammad"};
        StringInsertionSortASC(nama);

    }

    public static void IntSelectionSortDSC (int angka[]){

        System.out.println("===Sebelum===");
        for (int a : angka){
            System.out.print(a + " ");
        }

        for (int i = 1; i < angka.length; i++){

            int j = i;
            while (j > 0){
                if (angka[j] > angka[j-1]){

                    int tampungan = angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1] = tampungan;

                }
                j--;
            }

        }

        System.out.println("\n===Sesudah===");
        for (int a : angka){
            System.out.print(a + " ");
        }

    }

    public static void DoubleInsertionSortASC (double ipkk[]){

        System.out.println("\n\n===Sebelum===");
        for (double p : ipkk){
            System.out.print(p + "  ");
        }

        for ( int i = 1; i < ipkk.length; i++){

            for (int j = i; j > 0; j--){

                if ( ipkk[j] < ipkk[j-1]){

                    double tampungan = ipkk[j];
                    ipkk[j] = ipkk[j-1];
                    ipkk[j-1] = tampungan;

                }

            }

        }

        System.out.println("\n===Sesudah===");
        for (double p : ipkk){
            System.out.print(p + "  ");
        }

    }

    public static void CharInsertionSortDSC (char kata[]) {

        System.out.println("\n\n===Sebelum===");
        for (char c : kata) {
            System.out.print(c + " ");
        }

        for (int i = 1; i < kata.length; i++) {

            for (int j = i; j > 0; j--) {

                if (kata[j] > kata[j - 1]) {

                    char tampungan = kata[j];
                    kata[j] = kata[j - 1];
                    kata[j - 1] = tampungan;

                }

            }

        }

        System.out.println("\n===Sesudah===");
        for (char c : kata) {
            System.out.print(c + " ");
        }
    }

    public static void StringInsertionSortASC (String kalimat[]) {

        System.out.println("\n\n===Sebelum===");
        for (String k : kalimat) {
            System.out.print(k + " ");
        }

        for (int i = 1; i < kalimat.length; i++) {

            for (int j = i; j > 0; j--) {

                if (kalimat[j].compareTo(kalimat[j - 1]) < 0) {

                    String tampungan = kalimat[j];
                    kalimat[j] = kalimat[j - 1];
                    kalimat[j - 1] = tampungan;

                }

            }

        }

        System.out.println("\n===Sesudah===");
        for (String k : kalimat) {
            System.out.print(k + " ");
        }
    }

}
