package com.company;
import java.util.Scanner;

public class o4_Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        System.out.print("Enter the number of term you want: ");
        int r=s.nextInt();

        for (int i=1;i<=r;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        s.close();
    }
}
