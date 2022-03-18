package skillrack;

import java.util.ArrayList;
import java.util.Scanner;

public class dc2 {
      static void fi(String b,ArrayList<String> a,int n){
          for(int i=0;i<n;i++){
              if(b.charAt(b.length()-1) == a.get(i).charAt(0)){
                  System.out.print(a.get(i));
              }
          }

      }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          ArrayList<String> al=new ArrayList<String>();
          for(int i=0;i<al.size();i++) {
              al.add(sc.next());

          }

        /*  int find=sc.nextInt();
          String b=sc.next();

          ArrayList<String> a2=new ArrayList<>();
          a2.add(b);

          for(int i=0;i<n-1;i++){
              fi(b,al,n);
          }

         */
    }
}