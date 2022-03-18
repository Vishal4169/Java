package skillrack;

import java.sql.SQLOutput;
import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int tc=0;
        char lc = 0,up=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>=97 && st.charAt(i)<=122){
                lc=st.charAt(i);
                if(up>=65 && up<=90){
                    tc++;
                    up=0;
                }
            }
            else if(st.charAt(i)>=65 && st.charAt(i)<=90){
                up=st.charAt(i);
                if(lc>=97 && lc<=122){
                    tc++;
                    lc=0;
                }
            }
            else if(st.charAt(i)==' '){
                lc=0;up=0;
            }
            else{
                lc=0;up=0;
            }
        }

        System.out.println(tc);
    }
}
