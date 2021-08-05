package string;
import java.util.*;
public class maximumoccuranceofchar {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String ch=scan.nextLine();
        char[] ch_Arr=ch.toCharArray();

        Map<Character,Integer> map=new LinkedHashMap<>();
        int size=ch_Arr.length;
        int i=0;
        while(i!=size){
            if(map.containsKey(ch_Arr[i])==false){
                map.put(ch_Arr[i],1);
            }
            else{
                int oldval=map.get(ch_Arr[i]);
                int newval=oldval+1;
                map.put(ch_Arr[i],newval);
            }
            i++;

        }

        Set<Map.Entry<Character,Integer>> lmap=map.entrySet();

        char maxchar=' ';
        int maxval=0;
        for(Map.Entry<Character,Integer>  data:lmap){
            if(data.getValue() > maxval){
                maxchar= data.getKey();
                maxval=data.getValue();
            }
        }
        System.out.println(maxval +  " -- "+ maxchar);
    }
}


