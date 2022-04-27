package Shashwat;
import java.util.Scanner;

public class o4_Bubble_Sort {

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

    public static void Bubble_Sort(int[]arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                // j<length-1 pe bhi kaam karega par (-i) karne se aue efficient ho jaega.

                if (arr[j]>arr[j+1]){
                    // Swapping:
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr =TakeUserInput();
        Bubble_Sort(arr);
        System.out.print("\nArray after sorting: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
}
