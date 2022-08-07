package String;
import java.util.*;
public class GenricPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inp= sc.nextLine();
        String str="";
        for(int i=0; i<inp.length(); i=i+2){
            String temp=inp.substring(i,i+2);
            if(temp.equals("00")){
                str=str+"C";
            }
            else if(temp.equals("01")){
                str=str+"G";
            }
            else if(temp.equals("10")){
                str=str+"A";
            }
            else if(temp.equals("11")){
                str=str+"T";
            }
        }
        System.out.println(str);
    }
}
