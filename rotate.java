package Zoho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rotate {
    static boolean prime(int p){
        if(p==1){
            return true;
        }

        for(int i=2;i<p;i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[][] arr=new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
           }
       }
        ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-1;j++){
               int max=0;
               for(int k=i;k<i+2;k++){
                   for(int k1=j;k1<j+2;k1++){
                      boolean t=prime(arr[k][k1]);
                      if(t){
                        // System.out.print(arr[k][k1]+" ");
                         if(arr[k][k1]>max){
                             max=arr[k][k1];
                         }
                      }
                   }

                   //System.out.println();
               }
               al.add(max);
              // System.out.println();

           }

       }
       System.out.print(Collections.max(al));

    }
}
