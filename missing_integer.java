package skillrack;

import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

/*
5
1 2 3 5 20
 */
public class missing_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0,i;
        for(i=a[0];i<=a[a.length-1];i++){
            c=0;
            for(int j=0;j<n;j++){
                if(i==a[j]){
                    c=1;
                    break;
                }
            }
            if(c==0){
                System.out.print(i+" ");
            }
        }
    }
}
