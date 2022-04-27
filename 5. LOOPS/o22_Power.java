package com.company;

import java.util.Scanner;

public class o22_Power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=s.nextInt();
        System.out.print("Enter power: ");
        int n=s.nextInt();

        int ans=1;
        while (n>0)
        {
            ans*=x;
            n--;
        }
        System.out.println(ans);
        s.close();
    }
}
