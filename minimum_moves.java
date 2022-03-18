package array;

import java.util.Scanner;

public class minimum_moves {
    static void min_operation(int a,int b){
        int plus=0,bitWise=0;
        int plus_val=0,bitwise_val=0;
        int count=0;
        for(int i=a;i<=b;i++){
            if(a+i == b && plus==0){
                count++;
                plus_val=count;
                plus++;
            }
            else if((a|i) ==b && bitWise==0){
                count++;
                bitWise=count;
                bitWise++;
            }
            count++;
        }
        System.out.println(plus_val+" "+bitwise_val);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(7|16);
            int a=sc.nextInt();
            int b=sc.nextInt();
            min_operation(a,b);
        }
    }
}
