package com.company;

import java.util.*;

public class o6_Linear_Search {

    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void PrintArray(int[] arr) {

        System.out.print("\nThe array is: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("]\n\n");

    }

    public static void Linear_Search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i+", OR at position: "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("Element Not Found!");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = TakeUserInput();

        System.out.print("\nEnter key: ");
        int key = s.nextInt();

        PrintArray(arr);

        Linear_Search(arr, key);

    }
}


