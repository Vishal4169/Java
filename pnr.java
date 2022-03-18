package skillrack;
import java.util.ArrayList;
import java.util.Scanner;
public class pnr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        String[] st = new String[s + 1];
        for (int i = 0; i < s + 1; i++) {
            st[i] = sc.nextLine();
        }
        ArrayList<String> st1 = new ArrayList<>();
        for (int i = 1; i < s + 1; i++) {
            st1.add(st[i]);
        }

        ArrayList<String> st2 = new ArrayList<>();
        int c = sc.nextInt();
        String[] ss = new String[c + 1];
        for (int i = 0; i < c + 1; i++) {
            ss[i] = sc.nextLine();
        }

        for (int i = 1; i < c + 1; i++) {
            st2.add(ss[i]);
        }
        int i,j,cc=0;
        for(i=0;i<st1.size();i++){
            cc=0;
            for(j=0;j<st2.size();j++){
                if(st1.get(i).compareTo(st2.get(j))==0){
                    continue;
                }
                else{
                    cc++;
                }
            }
            if(cc>1){
                System.out.println(st1.get(i));

            }
        }

    }
}
