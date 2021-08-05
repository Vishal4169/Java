package string;
import java.util.*;
public class panagram {
    public static void main(String[] args){
        String str="abcdefg hijklmnop qrstuvwxyz";

        str=str.toUpperCase();
        str=str.replace(" ","");

        int[] str_Alph={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        char[] strchar=str.toCharArray();
        int size=strchar.length;
        int i=0;
        while(i!=size){
            int index=strchar[i]-65;
            str_Alph[index]=1;
            i++;

        }
        int x=0;
        while(x!=26){
            if(str_Alph[x]==1){
                x++;
            }
            else{
                System.out.println("not a pangram");
                System.exit(0);
            }
        }
        System.out.println("pangram");


    }
}
