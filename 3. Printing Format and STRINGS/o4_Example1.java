package company;

public class o4_Example1 {
    public static void main(String[] args) {

        String str="shashwatshandilya2003@gmail.com";
        int i=str.indexOf('@');

        String username=str.substring(0,i);
        String domainname=str.substring(i+1,str.length());

        System.out.println("USER NAME: "+username);
        System.out.println("DOMAIN NAME: "+domainname);

        System.out.println(domainname.startsWith("gmail"));

    }
}
