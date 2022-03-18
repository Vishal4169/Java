package array;

import java.util.Scanner;

public class subarray {

    static void op(int[] a,int num){
        for(int i=0;i<num;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            int num=sc.nextInt();
            int a[]=new int[num];
            for(int j=0;j<num;j++){
                a[j]= sc.nextInt();
            }
            System.out.println();
            op(a,num);

        }
    }
}
