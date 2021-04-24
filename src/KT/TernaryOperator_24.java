package KT;

import java.util.Scanner;

public class TernaryOperator_24 {
    public static void main(String[] args) {

        // ternary operator

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        // variable x = ekspresi ? statement_true : statement_false

        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("Hasilnya : " + x);
    }
}
