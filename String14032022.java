package skillrack;

import java.util.Scanner;

public class String14032022 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=2;i<str.length();i++){
            if(str.charAt(i)=='M' || str.charAt(i)=='F'){
                if(str.charAt(i-1)=='#' && str.charAt(i-2)=='#'){
                    if(str.charAt(i+1)=='M' && str.charAt(i-3)=='F' || str.charAt(i+1)=='F' && str.charAt(i-3)=='M' || str.charAt(i+1)=='#' && str.charAt(i-3)=='#' ) {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
/*
FF##MM##MFF##FFF###

####MM###M######M#
 */