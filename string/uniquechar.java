package string;
import java.util.*;

public class uniquechar {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String ch="has";
        char ch_arr[]=ch.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        int i=0,size=ch_arr.length;
        while(i!=size){
            if(!map.containsKey(ch_arr[i])){
                map.put(ch_arr[i],1);
            }
            else{
                int oldval=map.get(ch_arr[i]);
                int newval=oldval+1;
                map.put(ch_arr[i],newval );

            }
            i++;

        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        for (Map.Entry<Character,Integer> data: hmap) {
            if(data.getValue() >1){
                System.out.println("repeat character present in it");
                System.exit(0);
            }


        }
        System.out.println("unique present in it");

    }


}
