package Latihan.w3resource.BasicPart1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input first number: ");
        int fnum = userInput.nextInt();
        System.out.print("Input second number: ");
        int snum = userInput.nextInt();
        System.out.println( fnum + " x " + snum + " = " + snum * fnum);
    }

}
