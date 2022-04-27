package com.company;

public class o7_Swapping {
    public static void main(String[] args) {

        int a=10,b=5,temp;
        System.out.println(a+" "+b);

        /* By taking third variable: */
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);

        /* Without taking third variable: */
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a+" "+b);

        /* By bitwise operator: */
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);



    }
}
