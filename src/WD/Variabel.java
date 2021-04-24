package WD;

public class Variabel {

    public static class VariabelLokal{
        public void profile(){
            String nama = "Asep Sutisna";
            int umur = 19;
            System.out.println("Nama saya " + nama + " dan umur saya " + umur + " tahun");
        }
    }

    public static String hobi;
    public static final String hewan = "kucing";


    public static void main(String[] args) {

        VariabelLokal lokal = new VariabelLokal();
        lokal.profile();

        hobi = "Menulis";
        System.out.println("Hobi saya " + hobi);
        System.out.println("Hewan Peliharaan saya " + hewan);


    }

}
