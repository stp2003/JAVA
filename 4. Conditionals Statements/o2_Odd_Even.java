package com.company;
import java.util.Scanner;

public class o2_Odd_Even {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        /* This is for if-else: */
        if (number%2==0){
            System.out.println("Even number.");
        }
        else {
            System.out.println("Odd number.");
        }
    }
}
