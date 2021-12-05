package Udemy.PZN.JavaDasar;

public class S1_14_TernaryOperator {
    public static void main(String[] args) {
        //tanpa Ternary Operator (IF STATEMENT)
        var nilai = 90;
        String ucapan;

        if (nilai >= 70){
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Maaf anda belum lulus";
        }
        System.out.println(ucapan);

        //untuk kondisi diatas lebih baik pakai Ternary karena lebih simple
        // variabel = kondisi ? (nilai true) : (nilai false);
        String ucapan2 = nilai >= 70? "Selamat anda lulus" : "Maaf anda belum lulus";
        System.out.println(ucapan2);

    }
}
