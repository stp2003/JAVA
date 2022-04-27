package com.company;
import java.util.*;
public class o13_Inserting_Element_In_an_Array {

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

    public static int[] Insert(int[] arr,int pos,int num){
        int n=arr.length;
        int[] newarr =new int[n+1];

//        for (int i=n;i>pos;i--){
//            newarr[i]=newarr[i-1];
//        }
//        newarr[pos]=num;

        
        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = num;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr =TakeUserInput();
        System.out.print("\nEnter the position: ");
        int pos=s.nextInt();
        System.out.println("\nEnter the element: ");
        int num=s.nextInt();


        System.out.println("The inserted array is: "+ Arrays.toString(Insert(arr, pos, num)));
    }
}
