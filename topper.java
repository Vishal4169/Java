package skillrack;

import java.util.ArrayList;
import java.util.Scanner;

public class topper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> name=new ArrayList<>();
        ArrayList<String> math=new ArrayList<>();
        ArrayList<String> phy=new ArrayList<>();
        ArrayList<String> che =new ArrayList<>();
int c=0;
        while(n>=0){

            String st=sc.nextLine().trim();
            String st1[]=st.split(" ",10);
            for(String ss:st1){
                System.out.print(ss+" ");
            }

            /*name.add(st1[0]);
            math.add(st1[1]);
            phy.add(st1[2]);
            che.add(st1[3]);
            */
            n--;
        }


        ArrayList<Integer> tot=new ArrayList<>();
        for(int i=0;i<n;i++){
            tot.add(Integer.parseInt(math.get(i))+Integer.parseInt(phy.get(i))+Integer.parseInt(che.get(i)));
        }

        for(int t:tot){
            System.out.println(t);
        }
    }

}
