package com.company;

import java.util.Scanner;

public class o16_GDC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n=s.nextInt();
        int m=s.nextInt();
        while (m!=n)
        {
            if (m>n)
            {
                m=m-n;
            }
            else {
                n=n-m;
            }
        }
        System.out.println(m);
        s.close();
    }
}
