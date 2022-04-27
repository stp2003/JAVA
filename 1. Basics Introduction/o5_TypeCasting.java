package com.company;
import java.util.Scanner;

public class o5_TypeCasting {
    public static void main(String[] args) {

        long l= 1456265466646L;
        int i;
        float f=12.1f;
        double d;

//        l=i; // Implicit Typecasting:-> done by compiler
//        i=l;  // not possible

        i=(int)l; // Explicit typecasting:-> it can resul in data loss
        System.out.println(i);

        /* Converting char into int: */

        char c='a';
        c++;
        int g=c+1;
        System.out.println(++g);

        /* Converting int to char: */
        char u=(char)g;
        System.out.println(u);

    }
}
