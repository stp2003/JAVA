package com.company;

import java.util.Scanner;

public class o8_Sum_Of_Factors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                sum+=i;
            }
        }
        System.out.print("The sum of factors are: "+sum);
        s.close();
    }
}
