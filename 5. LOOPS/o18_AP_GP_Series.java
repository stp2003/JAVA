package com.company;

import java.util.Scanner;

public class o18_AP_GP_Series {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of terms,first term and common difference: ");
        int n=s.nextInt();
        int a=s.nextInt();
        int d=s.nextInt();

        int term=a;

        /* A.P series: */
        System.out.println("The A.P series is: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term +=d;
        }
        System.out.println();

        /* G.P series:  */
        System.out.print("Enter common ratio: ");
        int r=s.nextInt();
        System.out.println("The G.P series is: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term *=r;
        }
        s.close();

    }
}
