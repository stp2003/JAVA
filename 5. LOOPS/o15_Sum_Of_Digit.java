package com.company;

import java.util.Scanner;

public class o15_Sum_Of_Digit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r,sum=0;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            sum+=r;
        }
        System.out.println(sum);
        
        s.close();
    }
    
}
