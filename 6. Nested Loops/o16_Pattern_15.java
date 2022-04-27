package com.company;
/*
A
A B
A B C
A B C D
A B C D E
*/
public class o16_Pattern_15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                char c = (char) ('A' + j - 1);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}