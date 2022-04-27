package com.company;
import java.util.Scanner;

public class o3_Read_Keyboard {
    public static void main(String[] args) {
        int a,b;
        float f,g;
        String s;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two integer values: ");
        a=sc.nextInt();  // For integer values.
        b=sc.nextInt();
        System.out.println("The sum of integer values are: "+(a+b));

        boolean z=sc.hasNextInt(); // For checking whether the value entered is "INTEGER" or not.
        System.out.println(z);

        System.out.println("Enter two float values: ");
        f=sc.nextFloat();  // For float values.
        g=sc.nextFloat();
        System.out.println("The sum of float values are: "+(f+g));

        System.out.println("Enter a string:");
        s=sc.nextLine(); // For READING whole sentence.
        System.out.print("The string entered is: "+s);

        char q;
        q=s.charAt(4);  // For extracting a character at a given index.
        System.out.print("The character at given index is: "+q);

    }
}
