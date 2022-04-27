package com.company;
import java.util.Scanner;
/*
  *
 ***
 ***
  *
 * */
public class o21_Pattern_20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int firsthalf=(n+1)/2;
        int secondhalf=n/2;

        // First half
        for (int i=1;i<=firsthalf;i++)
        {
            for (int spaces=1;spaces<=(firsthalf-i);spaces++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // Second Half
        int i=secondhalf;
        while (i>=1)
        {
            int spaces=1;
            while (spaces<=(secondhalf-i+1))
            {
                System.out.print(" ");
                spaces++;
            }
            int j=1;
            while (j<=(2*i)-1)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

    }
}
