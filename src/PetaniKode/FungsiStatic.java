package PetaniKode;

public class FungsiStatic {

        // fungsi main
    public static void main(String[] args) {

        // pemanggilan fungsi static
        minum("Kopi");


        // mambuat instansiasi objek saya dari class FungsiStatic
        FungsiStatic saya = new FungsiStatic();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");

    }

    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }

    // Fungsi non-static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }

}
