package string;

public class firstchartocap {
    public static  void main(String[] args){
        String ch="vishal is good in programming";
        char str_org[]=ch.toCharArray();
        int size=str_org.length;
        int i=0;
        str_org[0]=(char) (str_org[0] -32);
        while(i!=size){
            if(str_org[i]== ' '){
                str_org[i+1]=(char)(str_org[i+1]-32);
            }
        i++;
        }
        System.out.println(str_org);

    }
}
