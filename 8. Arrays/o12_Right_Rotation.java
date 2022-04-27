package com.company;
import java.util.*;
public class o12_Right_Rotation
{

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

    public static int[] Right_Rotation_by_ONE(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];

        for (int i = n-1; i >0; i--) {
            arr[i]=arr[i-1];    // shift karte jaenge
        }
        arr[0]=temp;  // last pe first dal denge
        return arr;
    }

    public static int[] Right_Rotation_by_N(int[] arr, int n){
        for (int i = 0; i <n; i++) {
            Right_Rotation_by_ONE(arr);

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr =TakeUserInput();

        System.out.print("\nEnter Number of times of rotation: ");
        int n=s.nextInt();

        System.out.print("\nBefore Right rotation: ");
        PrintArray(arr);

        System.out.println("\nAfter Right rotation by 1: "+ Arrays.toString(Right_Rotation_by_ONE(arr)));
        System.out.println("\nAfter Right rotation by "+n+" is "+ Arrays.toString(Right_Rotation_by_N(arr,n)));

    }
}


