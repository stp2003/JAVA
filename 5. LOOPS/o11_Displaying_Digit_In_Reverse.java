package com.company;

import java.util.Scanner;

public class o11_Displaying_Digit_In_Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);

        }
        s.close();
    }
}
