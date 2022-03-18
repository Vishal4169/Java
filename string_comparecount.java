package skillrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class string_comparecount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        String s1[]=st1.split(" ");

        String st2=sc.nextLine();
        String s2[]=st2.split(" ");
        int len1=s1.length,len2=s2.length,count=0;
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<String> word=new ArrayList<>();
        for(int i=0;i<len1;i++){
            count=0;
            for(int j=0;j<len2;j++){
                if(s1[i].equals(s2[i])){
                    System.out.print(s1[i]+" "+s2[j])  ;
                    count++;
                }
            }
            word.add(s1[i]);
            num.add(count);

        }
        for(int i:num){
            System.out.println(i);
        }
    }
}
