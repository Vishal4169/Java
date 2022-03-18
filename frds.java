package Zoho;
/*
Input:
3
Mani 3 ram raj guna
Ram 2 kumar Kishore
Mughil 3 praveen Naveen Ramesh
Output:
Raj guna kumar Kishore praveen Naveen Ramesh
 */
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class frds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       ArrayList<String> first=new ArrayList<>();
       ArrayList<String> rem=new ArrayList<>();
       sc.nextLine();
        for(int i=0;i<n;i++){
            String[] st=sc.nextLine().toLowerCase(Locale.ROOT).split(" ");
            first.add(st[0]);
            for(int j=2;j<st.length;j++)
                 rem.add(st[j]);
            }

        for(int i=0;i< first.size();i++){
            for(int j=0;j<rem.size();j++){
                if(first.get(i).compareTo(rem.get(j))==0){
                    rem.remove(j);
                }
            }
        }
        System.out.println(rem);
        }



    }
