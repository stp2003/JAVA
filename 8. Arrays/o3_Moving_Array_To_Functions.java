package com.company;


import java.util.*;

public class o3_Moving_Array_To_Functions {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        
        for (int i = 0; i < size; i++) { // i<arr.length bhi use kar sakte
            System.out.print("\nEnter element at " + i + "th position: ");

            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }

    public static void PrintArray(int arr[]) {
        
        System.out.print("\nThe array is: [");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("]\n\n");

    }

    public static void main(String[] args) {
        int arr[] = TakeUserInput();
        PrintArray(arr);

    }

}
