public class ApaAja {

    public static void main(String[] args) {


        int[] numbers = {1, 4, 6, 9, 13, 16};


        int evenSum = 0;
        for (int genap : numbers){
            if (genap % 2 == 0) {
                evenSum = evenSum + genap;
            }
        }

        int oddSum = 0;
        for (int ganjil : numbers){
            if (ganjil % 2 == 1) {
                oddSum = oddSum + ganjil;
            }
        }

        System.out.println("Jumlah bilangan ganil adalah "+ evenSum);
        System.out.print("Jumlah bilangan ganil adalah "+ oddSum);




    }

}
