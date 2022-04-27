package com.company;
import java.util.Scanner;

public class o4_If_Else_Ladder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        /* This is for if-else LADDER : */
        if (a>b && a>c ){
            System.out.println(a+" is the greatest number.");
        }
        else if (b>c){
                System.out.println(b+" is the greatest number.");
        }
        else {
                System.out.println(c+" is the greatest number.");
        }
        }
    }

