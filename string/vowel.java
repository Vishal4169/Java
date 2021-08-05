package string;
import java.util.*;
public class vowel {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String ch=scan.nextLine();
        ch=ch.toUpperCase();
        char[] str_arr=ch.toCharArray();
        int size=ch.length();
        int i=0,vowcount=0,splcount=0,constcount=0;

        while(i!=size){

            if(str_arr[i]>='A' && str_arr[i]<='Z'){
                if(str_arr[i]=='A' || str_arr[i]=='E' || str_arr[i]=='I' || str_arr[i]=='O' || str_arr[i]=='E'){
                    vowcount++;
                }
                else{
                    constcount++;
                }
            }
            else{
                splcount++;
            }
            i++;
        }
        System.out.println("vowelcount"+vowcount);
        System.out.println("cosntanst count"+constcount);
        System.out.println("special character count"+splcount);


    }

}
