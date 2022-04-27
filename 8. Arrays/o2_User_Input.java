package com.company;

import java.util.*;

public class o2_User_Input {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();
        
        int arr[] = new int[size];
        
        // For taking input:
        for (int i = 0; i < size ; i++) {  // i<arr.length bhi use kar sakte
            System.out.print("\nEnter element at " + i + "th position: ");
            
            arr[i] = s.nextInt();
        }
       
        // For printing array:
        System.out.print("\nThe array is: [");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("]\n\n");

        s.close();
       
    }
}
  