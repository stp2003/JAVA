package com.company;

import java.util.Scanner;

public class o6_Print_Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float m1,m2,m3,avg;
        System.out.print("Enter marks of 3 subjects out of 100: ");
        m1=s.nextFloat();
        m2=s.nextFloat();
        m3=s.nextFloat();
        avg=(m1+m2+m3)/3;

        if(avg>=90){
            System.out.println("S grade.");
        }
        else if (avg>=60 && avg<90){
            System.out.println("A grade.");
        }
        else if (avg>=50 && avg<60){
            System.out.println("C grade.");
        }
        else {
            System.out.println("FAIL.");
        }
    }
}
