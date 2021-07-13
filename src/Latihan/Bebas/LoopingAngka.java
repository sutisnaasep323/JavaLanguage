package Latihan.Bebas;

public class LoopingAngka {
    public static void main(String[] args) {

        // FOR LOOP
        int sum = 1;
        for (int i = 0; i < 5;  i++){

            for (int j = 0; j <= i; j++){
                System.out.print(sum + " ");
                sum++;
            }

            System.out.print("\n");
        }

        System.out.print("\n");

        //While Loop
        int sum2 = 1;
        int i = 0;

        while (i < 5){
            int j = 0;
            while (j <= i) {
                System.out.print(sum2 + " ");
                sum2++;
                j++;
            }
            i++;
            System.out.print("\n");
        }

        System.out.print("\n");

        //Do While Loop
        int sum3 = 1;
        int k = 0;

        do{
            int j = 0;
            do{
                System.out.print(sum3 + " ");
                j++;
                sum3++;
            } while (j <= k);

            k++;
            System.out.print("\n");
        } while (k < 5);
    }
}
