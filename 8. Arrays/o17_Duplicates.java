package com.company;

import java.util.Scanner;

public class o17_Duplicates {

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

    public static void DuplicateArray(int[]arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                    System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {

        int[] arr =TakeUserInput();

        DuplicateArray(arr);
    }
}
