package com.company;

import java.util.Scanner;

public class o7_Switch_Case {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int day;
        System.out.print("Enter day: ");
        day=s.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Invalid Day!");

        }
    }
}
