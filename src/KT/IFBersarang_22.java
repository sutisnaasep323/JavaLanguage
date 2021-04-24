package KT;

public class IFBersarang_22 {
    public static void main(String[] args) {
        // nested if atau if bersarang

        int a = 2;
        int b = 10;

        System.out.println("ini adalah awal dari program");

        if (a == 5){

            if (b == 10){

                System.out.println("ini adalah dimana a = 5 dan b = 10");

            } else {

                System.out.println("ini adalah dimana a = 5 dan b bukan 10");

            }

        } else {

            System.out.println("ini adalah dimana a salah");

        }

        System.out.println("ini adalah akhir dari program");


        // PR

        int c = 1;
        int d = 2;
        int e = 3;

        System.out.println("=== START ===");
        if (c == 1){
            System.out.println("Ini dimana jika c = 1");
        } else {
            if (d == 2){
                System.out.println("Ini dimana jika d = 2");
            } else {
                if (e ==3){
                    System.out.println("Ini dimana jika e = 3");
                } else{
                    System.out.println("ini dimana e bukan 3");
                }
            }
        }

        System.out.println("=== FINISH ===");
    }
}
