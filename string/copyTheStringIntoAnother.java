package string;
import java.util.*;

public class copyTheStringIntoAnother {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String str="refer";
        char[] x=str.toCharArray();
        int size=str.length();
        char[] y=new char[size];
        int i=0;
        while(i!=size){
            y[size-i-1]=x[i];
            i++;
        }

        System.out.println(x);
        System.out.println(y);

    }
}
