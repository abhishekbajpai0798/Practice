import java.lang.reflect.Array;
import java.util.*;
public class temp {

    public static void main(String[] args) {
        String str[] = {"neet","code","love","you"};
        String myStr =encode(str);
        System.out.println(myStr);
        ArrayList res = new ArrayList(decode(myStr));
        System.out.println(res);
    }
    public static String encode(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }
    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hash = str.indexOf("#",i);
            System.out.println(str.substring(i,hash));
            int size = Integer.valueOf(str.substring(i,hash));
            i= hash+size+1;
            res.add(str.substring(hash+1,i));
        }
        return res;
    }
}