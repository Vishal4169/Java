package string;

public class Removechar {
    public static void main(String[] args){
        String ch="Good is GGbad";
        ch=ch.toUpperCase();
        char[] ch_Str=ch.toCharArray();
        int size=ch_Str.length;
        int i=0;
        String newchar=" ";
        char key='G';
        while(i!=size){
            if(ch_Str[i]!=key){
                newchar=newchar+ch_Str[i];
            }
            i++;
        }
        System.out.println(newchar);
    }
    //demo changes

}
