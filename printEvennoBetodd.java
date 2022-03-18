package skillrack;

import java.util.Scanner;

public class printEvennoBetodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int first=0,last=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2!=0){
                last=i;
                break;
            }
        }
      //  System.out.println(first+" "+last);
        int f=1;
        for(int i=first;i<=last;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                f=2;
            }
        }
        if(f==1){
            System.out.println(-1);
        }
    }
}
