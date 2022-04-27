package com.company;
/*
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
Note:
You need not print the array. You only need to populate it.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains an integer 'N'.
Output Format :
For each test case, print the elements of the array/list separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2
*/
import java.util.*;
public class o7_Arrange {

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

    public static int[] arrange(int[] arr,int n){
        int start=0;
        int end=n-1;
        int counter=1;

        while (start<=end){
            if (counter%2==1){
                arr[start]=counter;
                counter++;
                start++;
            }
            else {
                arr[end]=counter;
                counter++;
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr =TakeUserInput();

        int n=arr.length;

        System.out.println("The arranged array is: "+ Arrays.toString(arrange(arr, n)));

    }
}

