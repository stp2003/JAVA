package Shashwat;
import java.util.Scanner;

public class o3_Selection_Sort {

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

    public static void Selection_Sort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {  // 0 to length-2
            int min=arr[i];
            int minIndex=i;

            for (int j = i+1; j <arr.length ; j++) {  // i+1 to length-1
                if (arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                arr[minIndex]=arr[i];   // Swapping
                arr[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=TakeUserInput();
        System.out.print("\nArray before sorting: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }

        Selection_Sort(arr);

        System.out.print("\nArray after sorting: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
}
