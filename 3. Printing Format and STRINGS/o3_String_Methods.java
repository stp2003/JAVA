package company;

public class o3_String_Methods {
    public static void main(String[] args) {
        String str=new String("  Shashwat  ");

        str=str.trim(); // Trim the free spaces.

        /* Finds the length-> gives integer value.*/
        System.out.println("The length is: "+ str.length());

        str=str.toUpperCase();
        System.out.println("To upper case: "+str);

        String str1=str.toLowerCase();
        System.out.println("To lower case: "+str1);

        String str2=str.substring(3);
        System.out.println(str2);

        String str3=str.substring(3,5);
        System.out.println(str3);

        String srt4=str.replace('A','E');
        System.out.println(srt4);

        System.out.println(str.startsWith("SH"));
        System.out.println(str.startsWith("SH",3));

        System.out.println(str.endsWith("T"));
        System.out.println(str.endsWith("H"));

        System.out.println(str.charAt(4));

        System.out.println(str.indexOf('A'));
        System.out.println(str.indexOf("WA"));
        System.out.println(str.indexOf('A',3));
        System.out.println(str.indexOf("SH",2));

        System.out.println(str.lastIndexOf('A'));
        System.out.println(str.lastIndexOf("WA"));
        System.out.println(str.lastIndexOf('A',3));
        System.out.println(str.lastIndexOf("SH",2));

        String s="REACT ";
        String s1="react";
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareTo(s1));

        System.out.println(s.concat(s1));

    }
}
