package KT;

public class OperatorKomparasi_14 {

    public static void main(String[] args) {
        //Operator Komparasi, yang akan menghasilkan nilai dalam bentuk boolean

        int a, b;
        boolean hasilKomparasi;

        //Operator Equal atau persamaan
        System.out.println("======== PERSAMAAN ========");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        //Operator Not Equal atau pertidaksamaan
        System.out.println("======== PERTIDAKSAMAAN ========");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a, b, hasilKomparasi);

        //Operator less than atau kurang dari
        System.out.println("======== KURANG DARI ========");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);

        //Operator greather than atau Lebih dari
        System.out.println("======== LEBIH DARI ========");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        //Operator less than equal atau kurang dari sama dengan
        System.out.println("======== KURANG DARI SAMA DENGAN========");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        //Operator greather than equal atau Lebih dari sama dengan
        System.out.println("======== LEBIH DARI SAMA DENGAN ========");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a, b, hasilKomparasi);
    }

}
