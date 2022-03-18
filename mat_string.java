package skillrack;

import java.util.ArrayList;
import java.util.Scanner;
/*
2 2
b4c1a4 b1a1c5a2
a3b3c3 c9
 */
public class mat_string {
    static String print(String ch){
        String s="";
        for(int i=0;i<ch.length();i++){
            if(ch.charAt(i)>=48 && ch.charAt(i)<=57){
                char prev=ch.charAt(i-1);
                int loop=Character.getNumericValue(ch.charAt(i));

                for(int j=0;j<loop;j++){
                    s+=prev;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> al=new ArrayList<>();
        int r=sc.nextInt(),c= sc.nextInt();
        for(int i=0;i<r*r;i++){
            String st=sc.next();
            String[] s=st.split(" ");
            for(int j=0;j<s.length;j++){
                al.add(print(s[j]));
            }
        }

        for(int i=0;i<al.size();i++){


        }
    }
}
