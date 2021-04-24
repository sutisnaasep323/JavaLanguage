package SWS;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        //Array 1 dimensi
            //Assigment
        int angka1[] = {1,6,3,7,8,2};

        for (int i = 0; i < angka1.length; i++){
            System.out.print(angka1[i] + " ");
        }

        System.out.println();

            //Declaration
        int[] angka2 = new int[5];

        angka2[0] = 8;
        angka2[1] = 6;
        angka2[2] = 9;
        angka2[3] = 3;
        angka2[4] = 5;

        for (int i = 0; i < angka2.length; i++){
            System.out.print(angka2[i] + " ");
        }

        System.out.println("\n");
        //Array 2 dimensi
            //Assigment

        int angka3[][] = {{7,34,2,62,4,6},{9,21,35,72}};

        for ( int i = 0; i < angka3.length; i++){

            for (int j = 0; j < angka3[i].length; j++){
                System.out.print(angka3[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

            //Declaration
        int angka4[][] = new int[3][5];

        angka4[1][2] = 8;
        angka4[0][0] = 8;
        angka4[2][0] = 8;
        angka4[0][4] = 8;
        angka4[1][1] = 8;
        angka4[1][3] = 8;
        angka4[2][4] = 8;


        for ( int i = 0; i < angka4.length; i++){

            for (int j = 0; j < angka4[i].length; j++){
                System.out.print(angka4[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        //iseng-iseng

        Scanner input = new Scanner(System.in);

        int angka5[][] = new int[2][3];

        for ( int i = 0; i < angka5.length; i++){

            for (int j = 0; j < angka5[i].length; j++){
                System.out.print("Masukkan Nomor : ");
                angka5[i][j] = input.nextInt();

            }
            System.out.println();
        }

        System.out.println("Hasilnya : ");

        for ( int i = 0; i < angka5.length; i++){

            for (int j = 0; j < angka5[i].length; j++){
                System.out.print(angka5[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
