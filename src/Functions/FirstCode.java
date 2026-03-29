package Functions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstCode {
    public static void main(String[] args) {

       // [a,b,c,a,a,d,b]
        //key value
       //a=>3
        //b=>2
        //c=>1
        //d=>1

        //unorderd
        //HashMap<KeyType, ValueType> map = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        Map<String,Integer> map3 = new HashMap<String, Integer>();

        //
        LinkedHashMap<String,Integer>  map4 = new LinkedHashMap<>();

        //CRUD

        // Adding elements o(1);
        map.put("Abhi", 10);
        map.put("Charu",50);


        System.out.println(map);
        // Accessing element // o(1);
        int val = map.get("Abhi"); // => 10
        System.out.println(val);

        //check the key and return boolean
        System.out.println(map.containsKey("Abhi"));

        //remove the key from hashmap
        map.remove("Abhi"); //o(1)
        System.out.println(map);

        //know the size of map
        System.out.println(map.size());



    }
}
