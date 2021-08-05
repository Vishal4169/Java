package string;
import  java.util.*;
public class palindromeornot {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String str=scan.nextLine();
        str=str.replace(" ","");
        str=str.toLowerCase();
        char[] str_org=str.toCharArray();

        int size=str.length();
        char[] str_ano=new char[size];
        int i=0;
        while(i!=size){
            str_ano[size-i-1]=str_org[i];
            i++;
        }
        int val=0;
        for(i=0;i<size;i++){
            if(str_org[i] == str_ano[i]){
                continue;
            }
            else{
                val=1;
                break;
            }
        }
        if(val==1){
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }

    }
}
