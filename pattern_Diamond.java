package skillrack;

import java.util.Scanner;

public class pattern_Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int form=n*2-1;
        int a[][]=new int[form][form];
        for(int i=0;i<form;i++){
            for(int j=0;j<form;j++){
                a[i][j]=0;
            }
        }
        int find=form/2;
        int us1=find;
        int count=1;
        int i=0,j=find;
        while(i!=find+1){
            a[i++][j--]=count++;
        }
       j=1;
        while(j!=us1+1){
            a[i++][j++]=count++;
        }

       // System.out.println(i+" "+j);
        i=i-2;
        while(i!=us1){
           // System.out.println(i+" "+j);
           a[i--][j++]=count++;
        }
        //System.out.print(i+" "+j);
        while(j!=us1){
            a[i--][j--]=count++;
        }


        for(int ik=0;ik<form;ik++){
            for(int jk=0;jk<form;jk++){
                System.out.print(a[ik][jk]+" ");
            }
            System.out.println();
        }

    }
}
