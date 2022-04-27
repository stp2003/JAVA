package Shashwat;
import java.util.Scanner;

public class o2_Binary_Search {

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

    public static int Binary_Search(int[] arr,int key){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=(start+end)/2;

            if (key==arr[mid])
                return mid;
            else if (key>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=TakeUserInput();

        System.out.print("\nEnter key: ");
        int key=s.nextInt();

        int index=Binary_Search(arr,key);

        if (index!=-1)
            System.out.print("\nThe element found at: "+index);
        else
            System.out.print("Element NOT Found!");
    }
}
