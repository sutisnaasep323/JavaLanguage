package Latihan.Bebas;

public class LatihanRekursif {
    public static void main(String[] args) {

        System.out.println(hitungRekursif(5));

    }

    public static int hitungRekursif(int nilai) {
        if (nilai == 1) {
            return nilai;
        } else {
            return nilai * hitungRekursif(nilai - 1);
        }
    }


}
