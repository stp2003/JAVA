package company;

public class o6_Example2 {
    public static void main(String[] args) {

        /* Removes special characters: */
        String s="ghgd$!#!#$Q%#11567";
        System.out.println(s.replaceAll("[^a-zA-z0-9]",""));

        /* Removes free spaces: */
        String s1="   asdd  sdsd deddsf  ";
        System.out.println(s1.replaceAll("\\s+"," ").trim());

        /* counts number of strings: */
        String s2=" sdj   wjke dyebi ug g u  iwdffuyasjgdfy   ";
        s2=s2.replaceAll("\\s+"," ").trim();
        String words[]=s2.split("\\s");
        System.out.println(words.length);
    }
}
