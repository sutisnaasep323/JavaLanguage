package Udemy;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to exam result application");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first exam result:");
        int first_result=sc.nextInt();
        System.out.println("Please enter your second exam result");
        int second_result=sc.nextInt();

        if (first_result>50 && second_result>50){
            System.out.println("You got best college degree");
        }
        //first_result=55
        //second_result=40
        else if(first_result>50 || second_result >50){
            System.out.println("You got normal college degree!");
        }
        else {
            System.out.println("You can not have college degree!");
        }
    }
}
