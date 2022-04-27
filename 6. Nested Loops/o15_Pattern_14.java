package com.company;
/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/
public class o15_Pattern_14 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                char c=(char)('A'+j-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
