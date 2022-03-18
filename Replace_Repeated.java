package skillrack;

import java.util.Scanner;
/*
breezzzeeee

 */
public class Replace_Repeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        StringBuilder s = new StringBuilder(st);
        char ch;
        String newstring="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) {
                ch = (char) ((int) s.charAt(i) + 1);
                newstring += ch;
            }
            else{
                newstring+=s.charAt(i);
            }
        }
        System.out.println(newstring);
    }
}
