package com.company;

public class o1_Arithematic_Operators {
    public static void main(String[] args) {
        /* Difference between "/","%" operators: */
        int a=14,b=5;
        int c= a/b;
        int d=a%b;
        System.out.println(c);
        System.out.println(d);

        /* Arithmetic operations on float: */
        float e=(float) a/b;
        System.out.println(e);

        /* Operations on different data types: */
        byte h=10;
        short j=5;
        System.out.println((h+j)); // gives integer value.

        int l=5;
        float o=12.5f;
        System.out.println((l+o)); // gives float value.

        char w='a';
        int x=7;
        System.out.println((w+x)); // gives integer value.
        System.out.println((char) (w+x)); //gives char value.

        long v=4569L;
        double m=45.3;
        System.out.println((v/m)); // gives double value.

    }
}
