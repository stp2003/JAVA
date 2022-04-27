package company;

public class o5_Regular_Expression {
    public static void main(String[] args) {

        String str1="a";
        System.out.println(str1.matches("."));

        String str2="a4";
        System.out.println(str2.matches("[a-z][0-9]"));
    }
}
