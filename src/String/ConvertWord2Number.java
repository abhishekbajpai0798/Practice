package String;
import java.util.HashMap;

public class ConvertWord2Number {
    public static void main(String[] args) {
        String s="nine five eight four three six double zero triple seven";
        String[] str=new String[s.length()];
        String ans="";
        HashMap<String, String> map =new HashMap<>();
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        map.put("zero","0");


        for (int i=0; i<s.length(); i++){
             str=s.split(" ");
        }

        for (int i=0; i<str.length; i++){
            if(map.containsKey(str[i])){
                ans+=map.get(str[i]);
                //System.out.println(ans);
            }
            else if(str[i].equals("double") && map.containsKey(str[i+1])){
                ans+=map.get(str[i+1]);
                //System.out.println(ans);
            }
            else if(str[i].equals("triple") && map.containsKey(str[i+1])){
                ans+=map.get(str[i+1])+map.get(str[i+1]);
            }

        }
        System.out.println(ans);
        //System.out.println(Arrays.toString(str));

    }
}
