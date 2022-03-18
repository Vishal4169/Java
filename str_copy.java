package skillrack;
import java.util.*;
public class str_copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] st=s.split(" \\ +");
        for(int i=0;i<st.length;i++)
        {
            System.out.print(st[i]+" ");
        }
        String st1="SHIFT+";
        String st2="CAPSLOCK";
        int capon=0,shifton=0;
        for(int i=0;i<st.length;i++){
            if(st[i].compareTo(st1)==0){
                shifton=1;
            }
            else if(st[i].compareTo(st2)==0){
                if(capon==1){
                    capon=0;
                }
                else{
                    capon=1;
                }
            }
            else{
                if(shifton==1 && capon==1){
                    System.out.print(st[i].substring(1,st[i].length())+"");
                    shifton=0;
                }
                else if(shifton==1){
                    System.out.print(st[i].substring(1,st[i].length()).toUpperCase()+"");
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
