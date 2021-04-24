package Latihan.w3resource.BasicPart1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Input second number: ");
        int num2 = userInput.nextInt();

        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println( num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println( num1 + " % " + num2 + " = " + (num1 % num2));

    }
}
