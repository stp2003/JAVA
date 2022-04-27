package com.company;

import java.util.Scanner;

public class o19_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=s.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        s.close();
    }
}
