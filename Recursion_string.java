package Zoho;

import java.util.Scanner;
//recursive call

public class Recursion_string {
    static void recusive(String[] st,int n){
        for (int i=n-1;i>=0;i--){
            System.out.print(st[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] st=sc.nextLine().split(" ");
       recusive(st,st.length);
    }
}
