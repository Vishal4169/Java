package Zoho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prime {
    static boolean checkprime(int n){
        if(n==1){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            if(checkprime(al.get(i))) {
                int p = al.get(i);
                al.set(i, 0);
                int maxi = Collections.max(al);
                if (p > maxi) {
                    System.out.print(p + " ");
                }
            }
                else{
                    al.set(i,0);
                }

        }

    }
}
