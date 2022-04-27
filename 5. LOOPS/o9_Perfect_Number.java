package com.company;

import java.util.Scanner;

public class o9_Perfect_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0){
                sum+=i;
            }
        }
        if ((2*n)==sum)
        {
            System.out.println("Perfect Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
        s.close();
    }
}
