package Latihan.w3resource.BasicPart1;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input 1 = ");
        int num1 = userInput.nextInt();
        System.out.print("Input 2 = ");
        int num2 = userInput.nextInt();
        System.out.print("Input 3 = ");
        int num3 = userInput.nextInt();

        System.out.println("Total nilai = " + (num1 + num2 + num3));
        System.out.print("Rata-rata = " + ((num1 + num2 + num3) / 3));
    }
}
