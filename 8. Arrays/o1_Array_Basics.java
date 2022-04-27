package com.company;

public class o1_Array_Basics {
    public static void main(String[] args) {
        
        // For loop :
       int[] A ={1,2,3,4,5,6};
        
       System.out.print("\nFor loop se: [");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" "+A[i]);
        }
        System.out.print("]");

        // For-each Loop:
        int[] arr = new int[5];
        arr[0]=5;
        arr[1]=10;
        arr[2]=15;
        arr[3]=20;
        arr[4]=30;
        
        System.out.print("\n for each loop se: [");
        for (int i : arr) {
            System.out.print(" "+i);
        }
        System.out.print("]");
    }
}

