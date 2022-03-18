package skillrack;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class dc {
    static Long append(char s,String st){
        String ex="";
        int val=Character.getNumericValue(s);
        for(int i=0;i<val;i++){
            ex+=val;
        }

        String sts="";
        int lens=st.length();
        int c=0;
        for(int i=0;i<lens;i++){
            if(st.charAt(i)==s && c==0){
                for(int j=0;j<val;j++) sts += ex.charAt(j);
                c=1;
            }
            else{
                sts+=st.charAt(i);
            }
        }
        Long stsi=Long.valueOf(sts);
        return stsi;


    }

    static Long  expand(String s){
        ArrayList<Long> al=new ArrayList<>();

        int len=s.length();
        for(int i=0;i<len;i++){
        al.add(append(s.charAt(i),s));

        }

        Long max= Collections.max(al);
        return max;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Long> val=new ArrayList<>();
        for (int i = 0; i < n; i++) {
           val.add(expand(Integer.toString(a[i])));
        }

        Collections.sort(val);

        for(int i=0;i<n;i++){
            System.out.print(val.get(i)+" ");
        }

    }
}
