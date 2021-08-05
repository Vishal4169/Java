package string;
import java.util.*;
public class removeWhiteSpace {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String ch="the world is john    void main trunner";
        ch=ch.replaceAll("\\s","");
        System.out.println(ch);
    }
}
