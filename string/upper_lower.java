package string;

public class upper_lower {
     public static void main(String[] args){
         String ch="vishal good";
         char c[]=ch.toCharArray();
         int i=0;
         int size=ch.length();
         while(i!=size){

             if(c[i]!=' ') {
                 c[i] = (char) (c[i] - 32);

             }
             i++;

         }
         System.out.println(c);
         //System.out.println(ch.toLowerCase());
         //System.out.println(ch.toUpperCase());


     }
}
