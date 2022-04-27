package com.company;
import java.util.Scanner;

public class o1_Positive_Negative {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        /* This is for if-else: */
        if (number>=0){
            System.out.println("Positive number.");
        }
        else {
            System.out.println("Negative number.");
        }

    }
}
