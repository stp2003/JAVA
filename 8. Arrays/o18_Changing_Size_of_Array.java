package com.company;

import java.util.Scanner;

public class o18_Changing_Size_of_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] A = new int[size];

        System.out.print("\nEnter array element of first array: ");
        for (int i = 0; i < size; i++) {
            A[i] = s.nextInt();
        }

        System.out.print("Length of A= "+A.length);
        int[] B =new int[2*size];

        for (int i = 0; i <A.length ; i++) {
            B[i]=A[i];
        }
        A=B;

        System.out.print("\nLength of A= "+A.length);
    }
}
