package string;

public class RotationalString {
    public static void main(String[] args){
        String org_Str="vishal";
        String key_Str="lsvi";
        String new_Str=org_Str.concat(org_Str);
        if(new_Str.contains(key_Str)){
            System.out.println("Rotational string");
        }
        else{
            System.out.println("Not Rotational String");
        }
    }
}
