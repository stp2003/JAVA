package com.company;

import java.util.Scanner;

public class o7_Factors_Of_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        System.out.print("The factors are: ");
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                System.out.print(" "+i);
            }
        }
        s.close();
    }
}
