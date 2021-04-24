package PZN;

public class OperasiBoolean {

    public static void main(String[] args) {

        int kkm = 75, absen = 70, nilaiAkhir = 75;

        boolean lulusAbsen = absen >= kkm;
        boolean lulusNilai = nilaiAkhir >= kkm;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);

    }

}
