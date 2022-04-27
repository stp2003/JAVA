package com.company;

import java.util.*;

public class o4_Sum_of_Array_elements {

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

    public static int sum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int arr[]= TakeUserInput();
        System.out.print("Sum is: "+sum(arr));
        System.out.print("\nAverage is: "+(sum(arr))/arr.length);
        
    }
}
