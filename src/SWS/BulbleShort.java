package SWS;

public class BulbleShort {

    public static void main(String[] args) {

        int nilai[] = {34,56,12,64,23,68,35};

        IntBubleShortASC(nilai);

        double nilai1[] = {34.6, 12.6, 83.6, 23.8};
        DoubleBubleShortDSC(nilai1);

        char huruf[] = {'L', 'd', '!', 'a', 'A', '@', '1', '#', '7'};
        CharBubleShortASC(huruf);

        String absensi[] = {"Yumi", "Asep", "Abu Hammad", "Sutisna"};
        StringBulbleShortASC(absensi);

    }

    static void IntBubleShortASC( int bil[]){

        System.out.println("Integer Ascending\n" +
                "===Sebelum===");
        for ( int b : bil){
            System.out.print(b + " ");
        }

        for (int j = 0; j < bil.length; j++){

            for ( int i = 0; i < bil.length-1; i++){
                if (bil[i] > bil[i+1]){
                    int tampungan = bil[i];
                    bil[i] = bil[i+1];
                    bil[i+1] = tampungan;
                }
            }

        }

        System.out.println("\n===Sesudah===");
        for ( int b : bil){
            System.out.print(b + " ");
        }

    }



    static void DoubleBubleShortDSC(double bil1[]){
        System.out.println("\n\nDouble Descending" +
                "\n===Sebelum===");
        for ( double b1 : bil1){
            System.out.print(b1 + " ");
        }

        // Logika
        for (int i = 0; i < bil1.length; i++){

            for (int j = 0; j < bil1.length-1; j++){

                if (bil1[j] < bil1[j+1]){
                    double tampungan = bil1[j];
                    bil1[j] = bil1[j+1];
                    bil1[j+1] = tampungan;
                }

            }

        }


        System.out.println("\n===Sesudah===");
        for ( double b1 : bil1){
            System.out.print(b1 + " ");
        }
    }

    public static void CharBubleShortASC(char huruf[]){
        System.out.println("\n\nChar Ascending" +
                "\n===Sebelum===");
        for ( char k : huruf){
            System.out.print(k + " ");
        }

        for (int i = 0; i < huruf.length; i++){

            for (int j = 0; j < huruf.length-1; j++){

                if ( huruf[j] > huruf [j+1]) {
                    char tampungan = huruf[j];
                    huruf[j] = huruf[j + 1];
                    huruf[j + 1] = tampungan;
                }

            }

        }


        System.out.println("\n===Sesudah===");
        for ( char k : huruf){
            System.out.print(k + " ");
        }
    }

    public static void StringBulbleShortASC (String kata[]){

        System.out.println("\n\nString Ascending" +
                "\n===Sebelum===");
        for ( String k2 : kata){
            System.out.print(k2 + ", ");
        }

        for (int i = 0; i < kata.length; i++){

            for (int j = 0; j < kata.length-1; j++){

                if (kata[j].compareTo(kata[j+1]) > 0){

                    String tampungan = kata[j];
                    kata[j] = kata[j+1];
                    kata[j+1] = tampungan;
                }

            }

        }

        System.out.println("\n===Sesudah===");
        for ( String k2 : kata){
            System.out.print(k2 + ", ");
        }

    }

}


