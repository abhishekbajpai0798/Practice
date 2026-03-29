package String;
import java.util.*;

public class AllPossibleSubstring {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        int len = str.length();
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                String temp = str.substring(i,j+1);
                list.add(temp);
            }
        }
        System.out.println(list.toString());
    }
}
