package string;

public class another_methodcharAT {
    public static void main(String[] args){
        String ch="12355a";

        int size=ch.length();
        int i=0;
        while(i!=size){
            if(ch.charAt(i) >='0' && ch.charAt(i)<= '9'){
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
