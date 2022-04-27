package company;
public class o1_Printing {
    public static void main(String[] args) {

        int x=10,y=20;
        float z=12.56f;
        char c='A';

        System.out.println(x+y); // '+' used for adding

        System.out.println("NUM "+x); // '+' used for Concatenating

        System.out.println("SUM "+x+y); // '+' used for Concatenating

        System.out.println("SUM "+(x+y)); // '+' used for Concatenating with precedence to adding first.

        System.out.printf("Hello %d %f %c \n",x,z,c); // we can also use printf and format specifier.

        System.out.printf("Hello %o %f %c \n",x,z,c); // we can also use printf and format specifier in octal.

        System.out.printf("Hello %x %f %c \n",x,z,c); // we can also use printf and format specifier in hexadecimal.

        System.out.printf("Hello  %e \n",z); // we can also use printf and format specifier in scientific notation.

        System.out.printf("Hello %5d\n",x); // we can also use printf and format specifier giving empty spaces.

        System.out.printf("Hello %05d\n",x); // use printf and format specifier giving empty spaces filling with zero.

        System.out.printf("Hello %6.2f\n",z); // we can also use printf and format specifier giving empty spaces.

    }
}


