package com.company;

import java.util.Scanner;

public class o4_Simple_Calculator {
    public static void main(String[] args) {
        double x,y;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x=s.nextDouble();
        y=s.nextDouble();

        System.out.println("The sum of two numbers are: "+(x+y));
        System.out.println("The subtraction of two numbers are: "+(x-y));
        System.out.println("The multiplication of two numbers are: "+(x*y));
        System.out.println("The quotient of two numbers are: "+(x/y));
        System.out.println("The remainder of two numbers are: "+(x%y));


    }
}
