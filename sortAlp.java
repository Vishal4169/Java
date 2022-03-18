package skillrack;

import java.util.*;


public class sortAlp {


    public void sortLast(ArrayList<String> al) {

        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split(" ");
                String[] split2 = o2.split(" ");
                String lastName1 = split1[1];
                String lastName2 = split2[1];
                String f1=split1[0];
                String f2=split2[0];
                if(lastName1 == lastName2){
                    if(f1.compareTo(f2)>0){
                        return 1;
                    }
                    else{
                        return -1;
                    }

                }
                else if (lastName1.compareTo(lastName2) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for(String loop:al){
            System.out.println(loop);
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] al=new String[n+1];
        for(int i=0;i<n+1;i++){
            al[i]= sc.nextLine();
        }
        ArrayList<String> all=new ArrayList<>();
        int b=0;
        for(int i=1;i<n+1;i++){
            all.add(al[i]);
        }
        int size=all.size();
        sortAlp i = new sortAlp();

        i.sortLast(all);
    }
}
