package Zoho;

import java.util.Scanner;

public class sort_as_decc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n-2;i+=2){
            for(int j=i+2;j<n;j+=2) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=1;i<n-2;i+=2){
            if(a[i]>a[i+2]){
                int temp=a[i];
                a[i]=a[i+2];
                a[i+2]=temp;
            }
        }


        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
/*
7
13 2 4 15 12 10 5
13,2,12,10,5,15,4

 Input: 1 2 3 4 5 6 7 8 9
        Output: 9,2,7,4,5,6,3,8,1
 */
