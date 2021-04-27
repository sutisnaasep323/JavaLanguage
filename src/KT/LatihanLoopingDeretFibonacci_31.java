package KT;

import java.util.Scanner;

public class LatihanLoopingDeretFibonacci_31 {
    public static void main(String[] args) {
        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.println("==== FOR ====");
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }


        System.out.println("==== While ====");
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();

        int i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        while (i <= n) {
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }

        System.out.println("==== Do While ====");
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();

        int fn = 1;
        int fn_1 = 1;
        int fn_2 = 0;
        int ii = 1;

        do {
            System.out.println("nilai ke - " + ii + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            ii++;
        } while (ii <= n);

    }
}
