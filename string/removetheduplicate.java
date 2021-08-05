package string;
import java.util.*;
public class removetheduplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ch = scan.nextLine();
        char[] ch_str = ch.toCharArray();
        int size = ch_str.length;
        int i = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        while (i != size) {
            if(map.containsKey(ch_str)==false){
                map.put(ch_str[i],1);
            }
            else{
                int oldval=map.get(ch_str[i]);
                int newval=oldval+1;
                map.put(ch_str[i],newval);
            }
            i++;
        }

        String chval=" ";
        Set<Map.Entry<Character,Integer>> lmap=map.entrySet();
        for(Map.Entry<Character,Integer> data:lmap){
            chval=chval+data.getKey();
        }
       System.out.println(chval);
    }
}