package Zoho;

import java.util.Scanner;

public class String_reverseWithout_fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            count++;
            if(s.charAt(i)==' ' || i==0){
                for(int j=i;j<i+count;j++){
                    System.out.print(s.charAt(j));
                }
                System.out.print(" ");
                count=0;
            }
        }
    }
}
