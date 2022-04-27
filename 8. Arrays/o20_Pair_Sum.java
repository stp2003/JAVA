package com.company;

import java.util.Scanner;

public class o20_Pair_Sum {

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

    public static void PairSum(int[] A,int num){
        for (int i = 0; i <A.length ; i++) {
            for (int j = i+1; j <A.length ; j++) {
                if (A[i]+A[j]==num)
                    System.out.printf("%d +%d = %d ",A[i],A[j],num);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int[] arr =TakeUserInput();
        System.out.print("\nEnter number: ");
        int num=s.nextInt();
        PairSum(arr,num);

    }
}
