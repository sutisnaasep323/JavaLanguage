package SWS;

public class test {

    public static void main(String[] args) {
        int[] jumlah = new int[4];
        int[] total_pembeli = new int[4];
        String[] nama_pembeli = {"Kiki", "Maya", "Dio", "Kevin"};
        int[] banyak_barang = {3, 10, 6, 11};
        int[] satu_kilo = {5000};
        double[] total_harga = {0};
        int total_barang = 0;
        double diskon = 0.05;

        for (int i = 0; i < jumlah.length; i++) {
            //harga * banyak barang
            double harga = satu_kilo[jumlah[i]] * banyak_barang[i];
            //hitung potongan yang bisa didapat
            double potongan = harga * diskon;
            //kalau beli barang > 10 maka harga dipotong
            if(banyak_barang[i] > 10) harga = harga - potongan;
            //total barang yang dibeli
            total_barang += banyak_barang[i];
            System.out.print(i + 1);
            System.out.println(nama_pembeli[i] + ", " + satu_kilo[jumlah[i]] +
                    " x\t" + banyak_barang[i] + "\tkg " + "\t= " + (harga));
            //masukin harga yang udah dipotong, dan karena total_pembeli memiliki tipe data int, maka harga yang tipe data double harus diconvert jadi int pake "(int)"
            total_pembeli[i] = (int)harga;
            total_harga[0] += total_pembeli[i];
        }

        System.out.println("Total harga: " + total_harga[0] + "\nTotal barang: " + total_barang);
    }

}
