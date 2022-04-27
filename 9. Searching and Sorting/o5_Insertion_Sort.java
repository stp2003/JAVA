package Shashwat;

import java.util.Scanner;

public class o5_Insertion_Sort {

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

    public static void Insertion_Sort(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            int j=i-1;
            int temp=arr[i];

            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr =TakeUserInput();
        Insertion_Sort(arr);

        System.out.print("\nArray after sorting: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
}
