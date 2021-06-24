package KT;

public class LoopingArraywithForEach_41 {
    public static void main(String[] args) {

        int[] arrayAngka = {12,15,12,62,45,12,64};

        // looping Standart
        System.out.println("==== Looping Standart ====");
        for (int i = 0; i < 7; i++) {
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }

        //looping dengan property Length
        System.out.println("==== Looping with Length ====");
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }

        //looping with for each, digunakan ketika kita tidak membutuhkan index (hanya nilai)
        System.out.println("==== Looping with Length ====");
        for (int angka : arrayAngka){
            System.out.println("angka ini adalah " + angka);
        }
    }
}
