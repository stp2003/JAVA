package com.company;
import java.util.Scanner;

public class o6_Menu_Driven_Program_For_All_the_Previous_Program
{
    public static void Multiplication_Table()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        System.out.print("Enter the number of term you want: ");
        int r=s.nextInt();

        for (int i=1;i<=r;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    public static void Sum_N()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.print("The sum of First N natural Numbers are: "+sum);

    }

    public static void Factorial()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("The factorial of number is: "+fact);
    }

    public static void Factors()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        System.out.print("The factors are: ");
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                System.out.print(" "+i);
            }
        }
    }

    public static void Sum_of_Factors()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                sum+=i;
            }
        }
        System.out.print("The sum of factors are: "+sum);
    }

    public static void Perfect()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0){
                sum+=i;
            }
        }
        if ((2*n)==sum)
        {
            System.out.println("Perfect Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
    }

    public static void Prime_Number()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int count=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("Prime Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
    }

    public static void Displaying_Num_in_Reverse()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);

        }
    }

    public static void Count_Digit_of_Number()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int count=0;
        while (n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }

    public static void Amstrong_Number()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r,m,sum=0;
        m=n;
        while (n>0)
        {
            r=n%10;
            n/=10;
            sum+=r*r*r;
        }
        if (sum==m)
        {
            System.out.println("Amstrong Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
    }

    public static void Reverse()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r,m,rev=0;
        m=n;
        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if (rev==m)
        {
            System.out.println("Pallindrome Number.");
        }
        else
        {
            System.out.println("NOT.");
        }
    }

    public static void Sum_of_Digit()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int r,sum=0;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            sum+=r;
        }
        System.out.println(sum);
    }

    public static void GDC()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n=s.nextInt();
        int m=s.nextInt();
        while (m!=n)
        {
            if (m>n)
            {
                m=m-n;
            }
            else {
                n=n-m;
            }
        }
        System.out.println(m);
    }

    public static void Sum_N_Even_Numbers()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        int evenSum=0,oddSum=0;
        while (n>0)
        {
            int last=n%10;
            if (last%2==0)
            {
                evenSum+=last;
            }
            else
            {
                oddSum+=last;
            }
            n=n/10;
        }
        System.out.println("Even Sum: "+evenSum+" Odd Sum: "+oddSum);
    }

    public static void Fibonacci()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=s.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }


    public static void main(String[] args)
    {
        System.out.println("MENU: ");
        System.out.println("-------------------------------------");
        System.out.println("1. Multiplication Table.");
        System.out.println("2. Sum of N natural numbers.");
        System.out.println("3. Factorial of a number.");
        System.out.println("4. Factors of a number.");
        System.out.println("5. Sum of factors.");
        System.out.println("6. Perfect Number.");
        System.out.println("7. Prime Number.");
        System.out.println("8. Displaying digit in reverse.");
        System.out.println("9. Count digit of a number.");
        System.out.println("10. Amstrong number.");
        System.out.println("11. Reversing a number.");
        System.out.println("12. Sum of digit of a number.");
        System.out.println("13. GDC.");
        System.out.println("14. Sum of N even numbers.");
        System.out.println("15. Fibonacci Series.");
        System.out.println("-------------------------------------");

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the choice: ");
        int ch=s.nextInt();

            switch (ch) {
                case 1 -> Multiplication_Table();
                case 2 -> Sum_N();
                case 3 -> Factorial();
                case 4 -> Factors();
                case 5 -> Sum_of_Factors();
                case 6 -> Perfect();
                case 7 -> Prime_Number();
                case 8 -> Displaying_Num_in_Reverse();
                case 9 -> Count_Digit_of_Number();
                case 10 -> Amstrong_Number();
                case 11 -> Reverse();
                case 12 -> Sum_of_Digit();
                case 13 -> GDC();
                case 14 -> Sum_N_Even_Numbers();
                case 15 -> Fibonacci();
                default -> System.out.println("Invalid choice!!");
            }
    }
}
