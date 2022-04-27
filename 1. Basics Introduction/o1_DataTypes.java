package com.company;
import java.lang.String;

public class o1_DataTypes {
    public static void main(String[] args) {

        /* Primitive Data Type: */
        byte b=6;
        short s=78;
        int i=500;
        long l=456784L;

        float f=456.1f;
        double d=45.131649;

        char c='A';

        boolean x= false;

        /* Range and Size of Data Types:  */
        System.out.println("Int Min value: "+Integer.MIN_VALUE);
        System.out.println("Int Max value: "+Integer.MAX_VALUE);
        System.out.println("Int BYTES: "+Integer.BYTES);

        System.out.println("Float Min value: "+Float.MIN_VALUE);
        System.out.println("Float Max value: "+Float.MAX_VALUE);
        System.out.println("Float BYTES: "+Float.BYTES);

        /* Changing from Integer to Binary: */
        System.out.println("Int to BINARY is:"+Integer.toBinaryString(i));





    }
}
