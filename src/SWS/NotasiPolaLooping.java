package SWS;

public class NotasiPolaLooping {
    public static void main(String[] args) {
        /*
        X = sumbu horizontal. nilai yang kekanan
        y = sumbu vertikal. nilai yang kebawah
         */

        int x, y, spasi, k;

         int batas = 5;

//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan Batas : ");
//        byte batas = input.nextByte();

        // Looping 1-4 berjumlah 5 baris
        for (y = 1; y <= batas; y++){
            for (x = 1; x <= batas; x++){
                System.out.print(x);
            }
            System.out.println();
        }

    System.out.println();
        // Looping 4-1 berjumlah 5 baris
        for (y = batas; y >= 1; y--){
            for (x = batas; x >= 1; x--){
                System.out.print(x);
            }
            System.out.println();
        }
    System.out.println();

        // Looping 1 - 4 dengan mengikuti baris y, y = 1
        for (y = 1; y <= batas; y++){
            for (x = 1; x > y; x--){
                System.out.print(x);
            }
            System.out.println(y);
        }

    System.out.println();
        // Looping 4-1 dengan mengikuti baris y, y = baris (4)
        for (y = batas; y >= 1; y--){
            for (x = 1 ; x <= y; x++){
                System.out.print(x);
            }
            System.out.println();
        }

    System.out.println();

        for (y = 1; y <= batas; y++){

            for (spasi = 1; spasi <= y-1; spasi++){
                System.out.print(" ");
            }

            for (x = 1; x <= batas; x++){
                System.out.print(x);
            }

            for (spasi = 1; spasi <= ((batas-y)*2); spasi++){
                System.out.print(" ");
            }

            for (k = batas; k >= 1; k--){
                System.out.print(k);
            }

            System.out.println();
        }

        for (y = 1; y <= batas-1; y++){

            for (spasi = batas-1; spasi > y; spasi--){
                System.out.print(" ");
            }

            for (x = 1; x <= batas; x++){
                System.out.print(x);
            }

            for (spasi = 1; spasi <= y*2; spasi++){
                System.out.print(" ");
            }

            for (k = batas; k >= 1; k--){
                System.out.print(k);
            }


            System.out.println();
        }

    System.out.println();

        for (y = batas; y >= 1; y--){

            for (x = 1; x <= y; x++){
                System.out.print(" ");
            }

            for (spasi = 1; spasi < ((batas-y)*2); spasi++) {
                System.out.print(spasi);
            }

            System.out.println();
        }

        for (y = 1; y <= batas; y++){

            for (x = 1; x <= y; x++){
                System.out.print(" ");
            }

            for (spasi = 1; spasi < ((batas-y)*2); spasi++){
                System.out.print(spasi);
            }

            System.out.println();
        }


    System.out.println();

        for ( y = batas ; y >= 1 ; y--){
            for ( x = 1; x <= y; x++){
                System.out.print(x);
            }
            for (spasi = batas; spasi > y; spasi--){
                System.out.print(" ");
            }

            for (spasi = batas; spasi > y; spasi--){
                System.out.print(" ");
            }

            for ( k = 1; k <= y; k++){
                System.out.print(k);
            }

            System.out.println();
        }

    for ( y = 1; y <= batas; y++){
        for (x = 1; x <= y; x++){
            System.out.print(x);
        }

        for (spasi = batas; spasi > y; spasi--){
            System.out.print(" ");
        }

        for (spasi = batas; spasi > y; spasi--){
            System.out.print(" ");
        }

        for (k = 1; k <= y; k++){
            System.out.print(k);
        }

        System.out.println();
    }

    System.out.println("====== ini yang");

        for (y = batas; y >= 1; y--){

            for (spasi = batas; spasi > y; spasi--){
                System.out.print(" ");
            }

            for (x = 1; x <= batas; x++){
                System.out.print(x);
            }

            for (x = 1; x <= y; x++){
                System.out.print(x);
            }

            for (k = 1; k <= y; k++){
                System.out.print(k);
            }

            System.out.println();
        }

        for ( y = batas; y >= 1; y--){

            for (spasi = 1; spasi < y; spasi++){
                System.out.print(" ");
            }

            for ( x = 1; x <= batas; x++){
                System.out.print(x);
            }

            for (spasi = batas; spasi >= y; spasi--){
                System.out.print(spasi);
            }

            for (k = batas; k >= y; k--){
                System.out.print(k);
            }

            System.out.println();
        }

        System.out.println();

        for ( y = batas; y >= 1; y--){

            x = 1;
            while (x <= y){
                System.out.print(x);
                x++;
            }

            spasi = y;
            while (spasi < batas){
                System.out.print(" ");
                spasi++;
            }

            spasi = y;
            while (spasi < batas){
                System.out.print(" ");
                spasi++;
            }

            for (k = 1; k <= y; k++){
                System.out.print(k);
            }


            System.out.println();
        }

        for (y = 1; y <= batas; y++){

            x = 1;
            while (x <= y){
                System.out.print(x);
                x++;
            }

            spasi = y;
            while (spasi < batas){
                System.out.print(" ");
                spasi++;
            }

            spasi = y;
            while ( spasi < batas){
                System.out.print(" ");
                spasi++;
            }

            for ( k = 1; k <= y; k++){
                System.out.print(k);
            }

            System.out.println();
        }

        System.out.println("==== apa yaa");

        for ( y = batas; y >= 1; y--){

            for (x = y; x <= batas; x++){
                System.out.print(x);
            }

            for (spasi = 1; spasi <= batas; spasi++){
                System.out.print(" ");
            }

            for (k = 1; k <= y; k++){
                System.out.print(k);
            }

            for (k = 1; k <= y; k++){
                System.out.print(k);
            }

            for (spasi = 1; spasi <= batas; spasi++){
                System.out.print(" ");
            }

            for (x = y; x <= batas; x++){
                System.out.print(x);
            }

            System.out.println();
        }

        for ( y = 1; y <= batas; y++){

            for (x = batas; x >= y; x--){
                System.out.print(x);
            }

            for (spasi = batas; spasi >= 1; spasi--){
                System.out.print(" ");
            }

            for (k = 1; k <= y; k++){
                System.out.print(k);
            }

            for (k = 1; k <= y; k++){
                System.out.print(k);
            }


            for (spasi = 1; spasi <= batas; spasi++){
                System.out.print(" ");
            }

            for (x = y; x <= batas; x++){
                System.out.print(x);
            }


            System.out.println();
        }

        System.out.println("\n");

        for( y = batas; y >= 1; y--){

            for (x = y; x <= batas; x++){
                System.out.print(" ");
            }

            for (spasi = 1; spasi <= y; spasi++){
                System.out.print(spasi);
            }

            for (k = 1; k < y; k++){
                System.out.print(k);
            }

            System.out.println();
        }


        for ( y = 1; y <= batas; y++){

            for (x = batas; x >= y; x--){
                System.out.print(" ");
            }

            for (spasi = 1; spasi <= y; spasi++){
                System.out.print("*");
            }

            for (k = 1; k < y; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        for ( x = 1; x <= batas; x++){

            for ( y = 1; y <= batas; y++){
                System.out.print(" ");
            }

            for ( y = batas; y >= x; y-- ){
                System.out.print(" ");
            }

            for ( y = 1; y <= x; y++){
                System.out.print("*");
            }

            for ( y = 1; y < x; y++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (x = 1; x <= batas; x++){

            for (y = batas; y >= x; y--){
                System.out.print(" ");
            }

            for ( y = 1; y <= x; y++){
                System.out.print("*");
            }

            for (spasi = 1; spasi <= batas; spasi++){
                System.out.print(" ");
            }

            for (spasi = 1; spasi <= batas-1; spasi++){
                System.out.print(" ");
            }

            for (y = 1; y <= x; y++){
                System.out.print("*");
            }

            System.out.println();
        }

        for ( x = 1; x <= batas; x++){

            for ( y = 1; y <= x; y++){
                System.out.print(" ");
            }

            for ( y = batas; y >= x; y--){
                System.out.print("*");
            }

            for (spasi = 1; spasi <= batas; spasi++){
                System.out.print(" ");
            }

            for (spasi = 1; spasi <= batas-1; spasi++){
                System.out.print(" ");
            }

            for (y = batas; y >= x; y--){
                System.out.print("*");
            }

            System.out.println();
        }

        for ( x=1; x <= batas; x++){

            for ( y = 1; y <= batas; y++){
                System.out.print(" ");
            }

            for ( y = 1; y <= x; y++){
                System.out.print(" ");
            }

            for (y = batas; y >= x; y--){
                System.out.print("*");
            }

            for (y = batas; y > x; y--){
                System.out.print("*");
            }

            System.out.println();
        }



        for ( y = 1; y <= batas; y++) {

            for (x = 1+y; x <= y; x--) {
                System.out.print(x);
            }
            System.out.println();
        }


    }
}
