package skillrack;

import java.util.Scanner;
public class identical_toys {

    static int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),n=sc.nextInt();
        int r=t+n-1;
        int r1=fact(r);
        int r2=fact(t);
        int r3=fact(r-t);
        int d=r1/(r2*r3)%1000000007;
        System.out.println(d);
    }
}
