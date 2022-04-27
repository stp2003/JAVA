package com.company;

import java.util.*;

public class o5_Max_N_Min {

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

    public static int max(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int arr[] = TakeUserInput();
        System.out.print("\nMax is: " + max(arr));
        System.out.print("\nMin is: " + min(arr));

    }
}
