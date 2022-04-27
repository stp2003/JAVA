package com.company;
import java.util.Scanner;

public class o3_HERONS_Formula {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double area;
        float s;
        System.out.println("Enter 3 sides of a triangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));  // sqrt function return's DOUBLE value.
        System.out.println("The area of triangle is: "+area);
    }
}
