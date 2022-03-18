package Zoho;

import java.util.Scanner;

public class repeat_number_alpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String orgChar="";
        String num="";
        int l=0;
        int n1=0;
        for(int i=0;i<st.length();i++){
            if((st.charAt(i)>='A' && st.charAt(i)<='Z')   ||  (st.charAt(i)>='a' && st.charAt(i)<='z')){
                if(l==1) {
                     n1 = Integer.parseInt(num);
                    System.out.print(orgChar.repeat(n1));
                }
                orgChar="";
                num="";
                orgChar+=st.charAt(i);
                l=1;
            }
            else if(st.charAt(i)>='0' && st.charAt(i)<='9'){
                num+=st.charAt(i);
            }
        }

        System.out.print(orgChar.repeat(Integer.parseInt(num)));
    }
}
