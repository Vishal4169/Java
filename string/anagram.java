package string;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine(),s2=scan.nextLine();
        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Boolean result=Arrays.equals(arr1,arr2);
        if(result==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
}
