package com.company;
import java.util.Scanner;

public class o5_Sum_Of_N_Number
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.print("The sum of First N natural Numbers are: "+sum);
        s.close();
    }
}
