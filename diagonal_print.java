package Zoho;

import java.util.Scanner;

public class diagonal_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st= sc.next();
        int n=st.length();
        int charLop=0;
        int ch1=n-1;
        char a[][]=new char[n][n];
        int row=0,col=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    if(i==row && j==col){
                        row++;
                        ch1--;
                        col--;
                    }
                    a[i][j]=st.charAt(charLop);
                    System.out.print(st.charAt(charLop)+" ");
                    charLop++;
                }
                else if(i==row && j==col){
                        System.out.print(st.charAt(ch1) + " ");
                        row++;
                        ch1--;
                        col--;

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
