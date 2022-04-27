package com.company;
import java.util.*;
public class o8_Print_All_Pairs {

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

    public static void Print_All_Pairs(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){

            for (int j=i+1;j<n;j++){
                System.out.println("("+arr[i]+", "+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] A =TakeUserInput();
        Print_All_Pairs(A);

    }
}
