package string;
import java.util.*;
public class skillrackpro1 {
   public static void main(String[] args){
       Scanner scan =new Scanner(System.in);
       String str=scan.nextLine();
       char s[]=str.toCharArray();
       int size=s.length;
       int i=0;
       Map<Character,Integer> map=new TreeMap<>();
       while(i!=size){
           if(map.containsKey(s[i])==false){
               map.put(s[i],1);
           }
           else{
               int newval=map.get(s[i]);
               newval=newval+1;
               map.put(s[i],newval);
           }
           i++;
       }

       Set<Map.Entry<Character,Integer>> tmap=map.entrySet();

       int max=0;
       for(Map.Entry<Character,Integer> data:tmap){
           if(data.getValue() > max){
               max=data.getValue();
           }
       }
       System.out.print(max);
   }

}
