package skillrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class append {
    static void repeat(int n,String[] a,String cn1,String cn2,String n1,String n2){
        for(int i=0;i<n;i++){
            if(a[i].compareTo(cn1)==0){
                a[i]=n1;
            }
            else if(a[i].compareTo(cn2)==0){
                a[i]=n2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        int c=0,v=0,org_len=0;
        String n1="",n2="";
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<n-1;i++){
            c=0;
            for(int j=i+1;j<n;j++){
                if(a[i].length() == a[j].length()) {
                    c++;
                }
            }
            if(c==0){
                if(v==0){
                    n1+=a[i];
                    v=1;
                }
                else{
                    n2+=a[i];
                }
            }
            else{
                org_len=a[i].length();
            }
        }

        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i].compareTo(n1)==0 || a[i].compareTo(n2)==0){
                continue;
            }
            else{
                sum+=Integer.parseInt(a[i]);
            }
        }
        String cn1=n1,cn2=n2;
        if(n1.length()>org_len){
            n2+=n1.substring(org_len,n1.length());
            n1=n1.substring(0,org_len);
            repeat(n,a,cn1,cn2,n1,n2);
            sum+=Integer.parseInt(n1);
            sum+=Integer.parseInt(n2);
        }
        else{
            n1+=n2.substring(org_len,n2.length());
            n2=n2.substring(0,org_len);
            repeat(n,a,cn1,cn2,n1,n2);
            sum+=Integer.parseInt(n1);
            sum+=Integer.parseInt(n2);
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
