package skillrack;

import java.util.Scanner;

public class coint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int x=a[0];
        int m=0;
        int y=Math.max(a[0],a[1]);
        for(int i=2;i<n;i++){
             m=Math.max(a[i]+x,y);
            x=y;
            y=m;
        }
        System.out.println(m);
    }
}
