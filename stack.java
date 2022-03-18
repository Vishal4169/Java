package Zoho;

import java.util.Scanner;

public class stack {
     static char[] stacks=new char[1001];
    static int tops=-1;

    static void push(char c){
        stacks[++tops]=c;
    }
    static char pop(){
        if(tops==-1){
            System.out.println("empty");
        }
        System.out.print(stacks[tops]+" ");
        return stacks[tops--];

    }
    static void display(){
        for(int i=tops;i>=0;i--){
            System.out.print(stacks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){

             while(pop()!='(');


            }
            else{
                push(s.charAt(i));
            }
        }
        display();
    }
}
