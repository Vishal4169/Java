package string;
import java.io.CharConversionException;
import java.util.*;
public class mapfunctions {
    public static void main(String[] args){
        String ch="classmate";
        char[] ch_arr=ch.toCharArray();
        int size=ch_arr.length,i=0;

        Map<Character,Integer> map=new HashMap<Character, Integer>();

        while(i!=size) {
            if (!map.containsKey(ch_arr[i])) {
                map.put(ch_arr[i], 1);
            } else {
                int oldchar = map.get(ch_arr[i]);
                int newchar = oldchar + 1;
                map.put(ch_arr[i], newchar);

            }
            i++;
        }

        Set<Map.Entry<Character,Integer>> hmap =map.entrySet();
        for (Map.Entry<Character,Integer> data: hmap) {

            System.out.print(data.getKey());
            System.out.println(data.getValue());

        }

    }
}

