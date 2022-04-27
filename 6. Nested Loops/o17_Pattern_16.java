package com.company;
/*
A
B B
C C C
D D D D
E E E E E
*/
public class o17_Pattern_16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                char c = (char) ('A' + i - 1);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
