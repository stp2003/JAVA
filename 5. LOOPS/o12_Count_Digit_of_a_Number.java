package com.company;

import java.util.Scanner;

public class o12_Count_Digit_of_a_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int count=0;
        while (n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
        s.close();
    }
}
