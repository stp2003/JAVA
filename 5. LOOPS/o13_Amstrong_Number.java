package com.company;

import java.util.Scanner;

public class o13_Amstrong_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r,m,sum=0;
        m=n;
        while (n>0)
        {
            r=n%10;
            n/=10;
            sum+=r*r*r;
        }
        if (sum==m)
        {
            System.out.println("Amstrong Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
        s.close();
    }
}
