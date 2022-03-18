package skillrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class largest_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st=Integer.toString(n);
        int len= st.length();
        int a[]=new int[len];
        int i=0;
        while(n>0){
            a[i++]=n%10;
            n/=10;
        }
        Arrays.sort(a);

        ArrayList<Integer> min=new ArrayList<>();
        for(int k=0;k<len;k++){
            if(a[k]%2==0){
                min.add(a[k]);
            }
        }
        int minval=Collections.min(min);

        for(int l=0;l<len;l++){

            if(a[l]==minval) {
                if (l == len - 1) {
                    break;
                } else {
                    int temp = a[l];
                    a[l] = a[len - 1];
                    a[len - 1] = temp;
                }
            }
        }
        for(int r=0;r<len-2;r++){
            for(int r1=r+1;r1<len-1;r1++){
                if(a[r]<a[r1]){
                    int t=a[r];
                    a[r]=a[r1];
                    a[r1]=t;
                }
            }
        }

        for(int ll:a){
            System.out.print(ll+"");
        }

    }
}
