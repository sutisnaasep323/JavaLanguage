package KT;

public class BreakContinuedanReturn_32 {
    public static void main(String[] args) {

        int a = 0;

        while (true) {

            if (a == 10) {
                break;
            }

            a++;
            System.out.println("Loop ke - " + a);
        }

        System.out.println("=== Akhir program ===");

    }
}
