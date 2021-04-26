package Udemy;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you exam: ");
        int number = sc.nextInt();


        switch (number){
            case 70:
                System.out.println("You got C");
                break;
            case 80:
                System.out.println("You got B");
                break;
            case 90:
                System.out.println("You got A");
                break;
            default:
                System.out.println("Sorry, try again last year");
        }
    }
}
