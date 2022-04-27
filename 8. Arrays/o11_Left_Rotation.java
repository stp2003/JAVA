package com.company;
import java.util.*;
public class o11_Left_Rotation {

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


    public static void PrintArray(int arr[]) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("]\n\n");

    }

    public static int[] Left_Rotation_by_ONE(int[] arr){
        int n=arr.length;
        int temp=arr[0];

        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];    // shift karte jaenge
        }
        arr[n-1]=temp;  // last pe first dal denge
        return arr;
    }

    public static int[] Left_Rotation_by_N(int[] arr,int n){
        for (int i = 0; i <n; i++) {
            Left_Rotation_by_ONE(arr);

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr =TakeUserInput();

        System.out.print("\nEnter Number of times of rotation: ");
        int n=s.nextInt();

        System.out.print("\nBefore left rotation: ");
        PrintArray(arr);

        System.out.println("\nAfter left rotation by 1: "+ Arrays.toString(Left_Rotation_by_ONE(arr)));
        System.out.println("\nAfter left rotation by : "+n+ Arrays.toString(Left_Rotation_by_N(arr,n)));

    }
}
