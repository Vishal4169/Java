package string;

public class integer_verify {
    public static void main(String[] args){
        String ch="12355";
        char[] str_ch=ch.toCharArray();
        int size=str_ch.length;
        int i=0;
        while(i!=size){
            if(str_ch[i] >='0' && str_ch[i] <= '9'){
                i++;
            }
            else{
                System.out.println("character is involved");
                System.exit(0);
            }
        }
        System.out.println("integer only present");
    }
}
