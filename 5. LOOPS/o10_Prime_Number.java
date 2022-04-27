package com.company;

import java.util.Scanner;

public class o10_Prime_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int count=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("Prime Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
        s.close();
    }
}
