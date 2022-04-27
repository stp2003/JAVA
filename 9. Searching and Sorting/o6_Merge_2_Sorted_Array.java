package Shashwat;
import java.util.Scanner;

public class o6_Merge_2_Sorted_Array {

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

    public static int[] Merge_2_Sorted_Array(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] ans =new int[arr1.length+arr2.length];

        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else {
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }

        while (i<arr1.length){
            ans[k]=arr1[i];
            k++;
            i++;
        }

        while (j<arr2.length){
            ans[k]=arr2[i];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 =TakeUserInput();
        int[] arr2 =TakeUserInput();

        int[] ans= Merge_2_Sorted_Array(arr1,arr2);

        System.out.print("\nArray after sorting: ");
        for (int j : ans) {
            System.out.print(" " + j);
        }
    }
}
