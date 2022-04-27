package com.company;
import java.util.*;
public class o14_Deleting_an_Array_Element {

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

    public static void Delete(int[] arr,int pos){
        int x=0;
        int size=arr.length;
        if(pos>=0 && pos<arr.length){
            x=arr[pos];

            for (int i = pos; i <size ; i++) {
                arr[i]=arr[i+1];
            }
            size--;

            for (int i = 0; i <size ; i++) {
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=TakeUserInput();
        System.out.println("Enter position: ");
        int pos=s.nextInt();
        Delete(arr,pos);

    }
}
