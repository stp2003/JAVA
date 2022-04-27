package Shashwat;

import java.util.Scanner;

public class o11_Sum_of_Two_Arrays {

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

    public static int[] Sum_Of_Two_Arrays(int[] arr1,int[] arr2,int[] output){
        int i= arr1.length-1;
        int j= arr2.length-1;
        int carry=0;
        int k=Math.max(arr1.length,arr2.length);

        while (i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;

            i--; j--; k--;
        }

        while (i>=0){
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;

            i--;k--;
        }

        while (j>=0){
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;

            j--;k--;
        }
        output[0]=carry;

        return output;
    }

    public static void main(String[] args) {
        int[] arr1=TakeUserInput();
        int[] arr2=TakeUserInput();

        System.out.println("The sum of two arrays are: "+Sum_Of_Two_Arrays(arr1,arr2,));

    }
}
