package Shashwat;
import java.util.Scanner;

public class o8_Second_Largest {

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

    public static int Second_Largest(int[] arr){
        if (arr.length==0)
            return Integer.MIN_VALUE;

        int largest=arr[0] , secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }
            else if (secondLargest<arr[i] && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr=TakeUserInput();
        System.out.println("The second Largest Element is: "+Second_Largest(arr));
    }

}
