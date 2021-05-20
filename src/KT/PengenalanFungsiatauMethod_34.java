package KT;

public class PengenalanFungsiatauMethod_34 {
    public static void main(String[] args) {
        int y,x;
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }

    private static int hitung(int input){

        // static = istilah yang ada di oop, digunakan ketika berada di level class
        // private = modifier yang digunakan di class yang sama, secara default modifers nya adalah public

        int hasil;
        hasil= (input + 2) * input;
        return hasil;
        //return (input + 2) * input;
    }

}
