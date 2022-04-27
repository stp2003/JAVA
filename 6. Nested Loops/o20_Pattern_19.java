package com.company;

import java.util.Scanner;
/*
   1
  121
 12321
1234321
*/
public class o20_Pattern_19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i=1;
        while (i<=n)
        {
            int space=1;
            while (space<=n-i)
            {
                System.out.print(" ");
                space++;
            }
            int num=1;
            while (num<=i)
            {
                System.out.print(num);
                num++;
            }
            int dec=i-1;
            while (dec>=1)
            {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
