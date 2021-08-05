package string;
import java.util.*;




public class SwapOfTwoString {

    public static void main(String[] args){

        String ch="string1";
        String ch1="string2";

        swap(ch,ch1);

    }
    public static void swap(String ch1,String ch2){
           String temp=" ";
           temp=ch1;
           ch1=ch2;
           ch2=temp;
        System.out.println("after swapping "+ch1+" "+ch2);

    }
}
