package skillrack;

import java.util.Scanner;

/*
SHIFT+s k i l l CAPSLOCK r SHIFT+ack a b c

CAPSLOCK s k i l l SHIFT +rack CAPSLOCK SHIFT+c o d e
 */
public class str_shiftcap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] st=s.split("[\\+ ]");
        String st1="SHIFT";
        String st2="CAPSLOCK";
       int capon=0;
       int shifton=0;
       for(int i=0;i<st.length;i++){
          // System.out.print(st[i]+" ");
       }
        for(int i=0;i<st.length;i++){
            if(st[i].compareTo(st1)==0){
                shifton=1;
            }
            else if(st[i].compareTo(st2)==0){
                if(capon==1){
                    capon=0;
                }else{
                capon=1;}
            }
            else{
                if(shifton==1 && capon==1){
                    System.out.print(st[i].substring(0,st[i].length())+"");
                    shifton=0;
                }

               else if(shifton==1){
                    System.out.print(st[i].substring(0,st[i].length()).toUpperCase()+"");
                    shifton=0;
                }
                else if(capon==1){
                    System.out.print(st[i].toUpperCase()+"");
                }
                else{
                    System.out.print(st[i]+"");
                }
            }

        }


    }
}
