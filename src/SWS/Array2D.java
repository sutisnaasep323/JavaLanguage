package SWS;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Baris : ");
        int baris = input.nextInt();

        System.out.print("Masukkan Kolom : ");
        int kolom = input.nextInt();

        int barisan[][] = new int[baris][kolom];

        for ( int iBaris = 0; iBaris < baris; iBaris++ ){

            for ( int iKolom = 0; iKolom < kolom; iKolom++){

                if (baris % 2 == 0){

                    if (iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 0;
                    } else {
                        barisan[iBaris][iKolom] = 1;
                    }

                } else {

                    if (iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 1;
                    } else {
                        barisan[iBaris][iKolom] = 0;
                    }

                }

            }

        }

        //print
        for (int iBaris = 0; iBaris < baris; iBaris++){

            for (int iKolom = 0; iKolom < kolom; iKolom++){

                System.out.print(barisan[iBaris][iKolom] + " ");

            }

            System.out.println();
        }

        System.out.println("\n");

        for (int iBaris = 0; iBaris < baris; iBaris++){

            for (int iKolom = 0; iKolom < kolom; iKolom++){

                if (iBaris == 0 || iBaris == baris-1){
                    barisan[iBaris][iKolom] = 1;
                } else {
                    if (iKolom == 0 || iKolom == kolom-1){
                        barisan[iBaris][iKolom] = 1;
                    } else {
                        barisan[iBaris][iKolom] = 0;
                    }
                }

            }

        }

        //print
        for (int iBaris = 0; iBaris < baris; iBaris++){

            for (int iKolom = 0; iKolom < kolom; iKolom++){

                System.out.print(barisan[iBaris][iKolom] + " ");

            }

            System.out.println();
        }

        System.out.println("\n");

        for (int iBaris = 0; iBaris < baris; iBaris++){

            for (int iKolom = 0; iKolom < kolom; iKolom++){

                if ( iBaris == 0 || iBaris == baris-1 ){
                    barisan[iBaris][iKolom] = 0;
                } else {
                    if (iKolom == 0 || iKolom == kolom-1){
                        barisan[iBaris][iKolom] = 0;
                    } else {
                        barisan[iBaris][iKolom] = 1;
                    }
                }

            }

        }

        // print
        for (int iBaris = 0; iBaris < baris; iBaris++){

            for (int iKolom = 0; iKolom < kolom; iKolom++){
                System.out.print(barisan[iBaris][iKolom] + " ");
            }

            System.out.println();
        }

        System.out.println("\n");

        for (int iBaris = 0; iBaris < baris; iBaris++){

            for ( int iKolom = 0; iKolom < kolom; iKolom++){

                if (iKolom % 2 == 0){
                    barisan[iBaris][iKolom] = 1;
                } else {
                    barisan[iBaris][iKolom] = 0;
                }

            }

        }

        for (int iBaris2 = 0; iBaris2 < baris; iBaris2++){

            for (int iKolom2 = 0; iKolom2 < kolom; iKolom2++ ){
                System.out.print(barisan[iBaris2][iKolom2] + " ");
            }
            System.out.println();
        }

    }


}
