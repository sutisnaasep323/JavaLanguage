package KT;

public class MethodOverload_39 {
    public static void main (String args[]){

        printAngka(10);
        printAngka(10.2f);
        printAngka(100.8d);

        int hasilInt;
        hasilInt = tambah(10, 30);
        printAngka(hasilInt);

        float hasilFloat;
        hasilFloat = tambah(10.4f, 50);
        printAngka(hasilFloat);

        int hasilInt3;
        hasilInt3 = tambah(10, 10, 10);
        printAngka(hasilInt3);


    }

    public static void printAngka(int angka1){
        System.out.println("Angka yang di print adalah = " + angka1);
    }

    public static void printAngka(float angka1){
        System.out.println("Angka yang di print adalah = " + angka1);
    }

    public static void printAngka(double angka1){
        System.out.println("Angka yang di print adalah = " + angka1);
    }


    public static int tambah (int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    public static float tambah (int angkaInt, float angkaFloat){
        return angkaInt + angkaFloat;
    }

    public static float tambah (float angkaFloat, int angkaInt){
        return angkaFloat + angkaInt;
    }

    public static int tambah (int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
}
