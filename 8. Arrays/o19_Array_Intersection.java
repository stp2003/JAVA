package com.company;

import java.util.Scanner;

public class o19_Array_Intersection {

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

    public static void Intersection(int[] arr1,int[] arr2){
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {

                if (arr1[i]==arr2[j]){
                    System.out.print("The common elements are: "+arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 =TakeUserInput();
        int[] arr2 =TakeUserInput();

        Intersection(arr1,arr2);

    }
}
