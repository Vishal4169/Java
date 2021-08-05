package string;
import java.awt.*;
import java.util.*;
public class lengthofstring {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String str="programming in java";
        str=str.concat("\0");
        char[] y=str.toCharArray();
        int i=0,count=0;

        while(y[i]!='\0'){
            count++;
            i++;
        }
        System.out.println(count);

         //inbuilt function
        //System.out.println(str.length());
    }
}
