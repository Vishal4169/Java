package skillrack;

import java.util.Scanner;

public class gcd {
       static  int gcd(int a,int b){
           while(a!=b){
               if(a>b){
                   a=a-b;
               }
               else{
                   b=b-a;
               }
           }
           return b;

       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int n1=a[0];
        for(int i=1;i<n;i++){
            int n2=a[i];
            n1=gcd(n1,n2);
        }
        System.out.print(n1);
    }
}
