package com.company;

public class o5_Overload_to_Cal_AREA
{

    public static double area(double l,double b)
    {
        return l*b;
    }

    public static double area(double radius)
    {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args)
    {
        System.out.println("The area of rectangle is: "+area(10,5));
        System.out.println("the area of circle is: "+area(22.4));

    }
}
