package skillrack;

import java.awt.*;
import java.util.Scanner;

public class sortThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s11[]=s1.split(" ",2);
        String s2=sc.nextLine();
        String s22[]=s2.split(" ",2);
        String s3=sc.nextLine();
        String s33[]=s3.split(" ",2);
        if(s11[1].compareTo(s22[0])!=0 && s11[1].compareTo(s33[0])!=0){
            System.out.println(s1);
        }
        if(s22[1].compareTo(s11[0])!=0 && s22[1].compareTo(s33[0])!=0){
            System.out.println(s2);
        }
        else{
            System.out.println(s3);
        }
    }
}
