package PZN;

public class MethodeVariabelArgument {
    public static void main(String[] args) {

        // Tanpa Variabel Argument itu nilai nya harus dimasukkan ke dalam variabel
        int[] values = {54,62,78,48,98,87,79,99};
        SayCongrats("Asep", values);

        //nilai bisa langung di inputkan
        SayCongrats2("Hammad", 12,65,34,67,31,54);

    }

    // TANPA VARIABEL ARGUMENT
    public static void SayCongrats(String name, int[] values) {

        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalTotal = total / values.length;

        if (finalTotal >= 75) {
            System.out.println("Selamat " + name + " anda Lulus! dengan total nilai " + finalTotal);
        } else {
            System.out.println("Maaf " + name + " anda belum lulus dengan total nilai " + finalTotal);
        }

    }

    //Dengan VARIABEL ARGUMENT
    public static void SayCongrats2(String name, int... values) {

        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalTotal = total / values.length;

        if (finalTotal >= 75) {
            System.out.println("Selamat " + name + " anda Lulus! dengan total nilai " + finalTotal);
        } else {
            System.out.println("Maaf " + name + " anda belum lulus dengan total nilai " + finalTotal);
        }

    }
}
