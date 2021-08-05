package string;
import java.util.*;
public class stringIsMutable {
    public static void main(String[] args){
       /* String ch1="Cannot be changed";
        String ch2="immutable";
        ch1.concat(ch2);
        System.out.println(ch1);
*/
        StringBuilder x=new StringBuilder("can");
        StringBuilder y=new StringBuilder("mutable");
        x.append(y);
        System.out.println(x);
    }
}
