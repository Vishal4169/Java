package string;
import java.util.*;
public class string {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char[] s=str.toCharArray();
        int size=s.length,i=0;
        while(i!=size){
            if(s[i]>='a' && s[i]<'z'){
                System.out.print(s[i]+"");
            }
            i++;
        }
    }
}
