package array;

import java.util.Scanner;

public class dc06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[5];
        int lop=4;
        while(n!=0){

            if(n>9){
                a[lop--]=9;
                n=n-9;

            }

            else{
                if(lop==0){
                    a[lop]=n;
                }
                else{
                    a[lop--]=n-1;
                    n=n-1;
                    if(n==1){

                    }
                    System.out.println(n);
                }
            }
        }
        for(int i=4;i>=0;i--){
            System.out.print(a[i]+"");
        }
    }
}
