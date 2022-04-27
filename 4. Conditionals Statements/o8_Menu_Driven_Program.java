package com.company;
import java.util.Scanner;

public class o8_Menu_Driven_Program {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Menu:))->");
        System.out.println("-------------------------");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("-------------------------");

        System.out.print("Enter 2 number: ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.print("Enter options in words: ");
        String option;
        option=s.nextLine();
        option=option.toUpperCase();

        switch (option) {
            case "ADD" -> System.out.println("Sum is " + (a + b));
            case "SUB" -> System.out.println("Diff is " + (a - b));
            case "MUL" -> System.out.println("MUL is " + (a * b));
            case "DIV" -> System.out.println("DIV is " + (a + b));
            default -> System.out.println("Invalid option!!");
        }
    }
}
