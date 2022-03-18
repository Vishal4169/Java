package skillrack;
import java.util.*;
import java.util.logging.Logger;

public class check {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Long> a=new ArrayList<>();
         for(int i=0;i<n;i++){
            a.add(sc.nextLong());
        }
       String n1,n2;
        int ele_size=0;
         long min,max;
         if(a.size()==2){
             min = Collections.min(a);
             max = Collections.max(a);
             String st1=String.valueOf(min);
             String st2=String.valueOf(max);
             int fix=(st1.length()+st2.length())/2;
             st1+=st2.substring(fix,st2.length());
             st2=st2.substring(0,fix);
            n1=st1;
            n2=st2;
         }
         else {
              min = Collections.min(a);
             max = Collections.max(a);
            // System.out.println(max);
             for(int i=0;i<n;i++){
                 if(a.get(i)==max || a.get(i)==min){
                     continue;
                 }
                 else{
                     ele_size=a.get(i).toString().length();
                 }
             }

            // System.out.println(min+" "+max+" "+ele_size);
             n1 = String.valueOf(min);
              n2 = String.valueOf(max);

             n1 += n2.substring(ele_size, n2.length());
             n2 = n2.substring(0, ele_size);
         }

        long r1= Long.valueOf(n1);
        long r2=Long.valueOf(n2);

       for(int i=0;i<n;i++){
          if(a.get(i)==max){
              a.set(i,r2);
          }
          else if(a.get(i)==min){
              a.set(i,r1);
          }
      }
      int sum=0;
      for(long rr:a){
          sum+=rr;
        }
      for(long r:a){
         System.out.print(r+" ");

      }
        System.out.println();
        System.out.println(sum);



    }
}
