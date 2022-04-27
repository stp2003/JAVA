package com.company;
import java.util.Scanner;

public class o17_Digit_in_Words {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r;
        String str="";

        while (n>0)
        {
            r=n%10;
            n=n/10;
            str=str+r;
        }

        char c;
        for (int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch (c) {
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
            }
        }
        s.close();
    }
}
