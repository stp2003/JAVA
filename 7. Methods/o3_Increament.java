package com.company;

public class o3_Increament {
    public static void inc(int n)
    {
        // Primitive Data Type is passed by value.
        n++;
        System.out.println("Increment Function wala: "+n);
    }
    public static void main(String[] args)
    {
        int a=10;
        inc(a);
        System.out.println("Main wala: "+a);

    }
}
