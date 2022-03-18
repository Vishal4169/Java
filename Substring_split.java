package Zoho;

import java.util.Scanner;

/*
 String 1: test123string
         String 2: 123
        Output: 4
 */
public class Substring_split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        int l=l2;
        for(int i=0;i<=l1-l;i++){
            String subs=s1.substring(i,l2);
            if(subs.compareTo(s2)==0){
                System.out.print(i);
                System.exit(0);
            }
           // System.out.println(subs);
            l2++;
        }
        System.out.println("-1");
    }
}
