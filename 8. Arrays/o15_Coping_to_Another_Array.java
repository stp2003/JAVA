package com.company;
import java.util.*;
public class o15_Coping_to_Another_Array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        int[] A =new int[size];

        System.out.print("\nEnter array element of first array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("\tThe first array is: ");
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");

        }
        // Coping:
        System.out.print("\tThe second array is: ");
        for (int i = 0; i <size ; i++) {
            A[i]=arr[i];
            System.out.print(A[i]+"  ");
        }


    }
}
