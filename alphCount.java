package skillrack;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


public class alphCount {

    public static void main(String[] args) {
        int a[]=new int[26];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            String s1 = sc.next();
            Set<Character> d = new HashSet<>();
            for (int j = 0; j < s1.length(); j++) {
                d.add(s1.charAt(j));
            }
            for (char k : d) {
                char dd = k;
                a[((int) dd) - 97] += 1;
            }

        }
       int count=0;
        for(int i=0;i<26;i++){
            if(a[i]==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
