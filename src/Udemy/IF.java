package Udemy;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18 && age < 50){
            System.out.println("Your are adult");
        } else if (age > 50 && age < 100){
            System.out.println("Your are old");
        } else if (age > 3 && age < 18){
            System.out.println("Your are teeneger");
        }
    }

}
