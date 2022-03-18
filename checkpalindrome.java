package skillrack;


/*
leveLorp
5

*/

import java.util.Locale;
import java.util.Scanner;

public class checkpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder st=new StringBuilder(sc.next());
        int n=sc.nextInt();
        StringBuilder s1=new StringBuilder(st.substring(0,n).toLowerCase(Locale.ROOT));

        StringBuilder dup=new StringBuilder(st.substring(0,n).toLowerCase(Locale.ROOT));


        if(dup.compareTo(s1)==0){
            System.out.println("Yes");
        }
        else{
            System.out.print("No");
        }


    }
}
