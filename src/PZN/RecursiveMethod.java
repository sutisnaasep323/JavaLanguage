package PZN;

public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));

        System.out.println(factorialRecursive(5));

        //Loop(5909); -> batas maksimal loop my device
        Loop(10);

    }

    //Menyelesaikan rekursive dengan FOR biasa (Tanpa rekursive method)
    static int factorialLoop(int value) {
        var result = 1;

        for (var i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    //Recursive Method
    static int factorialRecursive(int value) {
        if (value == 1) {
            return value;
        } else {
            return value * factorialLoop(value - 1);
            // 5 * nilai sebelumnya
        }
    }

    //Stack error
    static void Loop (int nilai){
        if (nilai == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke-" + nilai);
            Loop(nilai-1);
        }

    }


}
