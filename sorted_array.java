package Zoho;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
    Array 1: 2,4,5,6,7,9,10,13
    Array 2: 2,3,4,5,6,7,8,9,11,15
    Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */
public class sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        String[] st1=s1.split(","),st2=s2.split(",");
        Set<Integer> arr1=new HashSet<>();
        for(int i=0;i< st1.length;i++)
            arr1.add(Integer.parseInt(st1[i]));
        for(int i=0;i< st2.length;i++)
            arr1.add(Integer.parseInt(st2[i]));
        for(int loop:arr1){
            System.out.print(loop+" ");
        }


    }
}
