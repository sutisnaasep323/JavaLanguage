package KT;

public class DoWhileLoop_28 {
    public static void main(String[] args) {

//        do {
//            aksi
//        } while (kondisi);


        int a = 10;
        boolean status = true;

        System.out.println("===Ini awal program===");
        do {
            a--;
            System.out.println("do While ke-" + a);

            if (a == 1){
                status = false;
            }

        } while (status);
            System.out.println("===Ini akhir program===");

    }
}
