package array;

import java.util.ArrayList;
import java.util.Scanner;

public class split_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> mat1=new ArrayList<>();
        ArrayList<String> mat2=new ArrayList<>();
        sc.nextLine();
        String[][] str=new String[1001][1001];
        int row=0,col=0;
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] st=s.split(",");
            str[row][col]=st[0];
            str[row][col+1]=st[1];
            row++;

        }

        for(int r=0;r<2;r++){
            for(int c=0;c<2;c++){
                System.out.print(str[r][c]+" ");
            }
            System.out.println();
        }
        for(String m1:mat1){
            System.out.print(m1+" ") ;

        }
        for(String m2:mat2){
            System.out.print(m2+" ") ;

        }
    }
}/*
luke,shaw
wayn,rooney
rooney,ronaldo
shaw,rooney
*/