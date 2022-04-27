package com.company;

import java.util.Scanner;

public class o4_Problem_1
{
    public static boolean isPrime(int n)
    {
        for (int i=2;i<n/2;i++)
        {
            if ((n%i)==0)
                return false;
        }
        return true;
    }

    public static int GCD(int m,int n)
    {
        while (m!=n){
            if (m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
//        int x=s.nextInt();
//        System.out.println(isPrime(x));

          int m=s.nextInt();
          int n=s.nextInt();

        System.out.println("GCD of "+m+" and "+n+" is "+GCD(m,n));

    }
}
