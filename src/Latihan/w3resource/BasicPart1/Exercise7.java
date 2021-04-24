package Latihan.w3resource.BasicPart1;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Input a number : ");
        int input = userInput.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }

}
