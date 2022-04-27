package com.company;
import java.util.Scanner;

public class o2_NCR_using_Functions
{
    public static int factorial(int num)
    {
        int fact=1;
        for (int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        o2_NCR_using_Functions mp=new o2_NCR_using_Functions();
        int factN=mp.factorial(n);
        int factR=factorial(r);
        int factNR=factorial(n-r);

        int result=factN/(factR*factNR);
        System.out.println(n+"C"+r+" = "+result);

    }
}
