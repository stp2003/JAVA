package com.company;
import java.util.*;
public class o16_Reverse_Coping_Elements {

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
        // Reverse Coping:
        System.out.print("\tThe second array is: ");
        for (int i = arr.length-1,j=0; i>=0 ; i--,j++) {              // Reversing
            A[j]=arr[i];

        }
        for (int i = 0; i <arr.length ; i++) {                      // Replacing
            arr[i]=A[i];
            System.out.print(A[i]+"  ");

        }
    }
}
