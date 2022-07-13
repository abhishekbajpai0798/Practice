package Subset;
/*Note: for String subset is call as subsequence
      for array it is call as subset
      where p-> Processed String and up -> Unprocessed string
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("","abc");
        System.out.println(subSeqList("","abc"));
    }
    public static void subSeq(String p, String up){
        //base Condition
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        //take particular character and make two recursion call either take it or ignore it.
        char ch=up.charAt(0);
        subSeq(p+ch, up.substring(1)); // character is taken on processed string
        subSeq(p, up.substring(1));  // character is not taken on processed string

    }
    //return answer in array list
    public static ArrayList<String> subSeqList(String p, String up){
        //base condition
        if(up.isEmpty()) {
            //every time create the new list while it returns and the character on them.
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        //take particular character and make two recursion call and store it on either left list or right list.
        char ch=up.charAt(0);
        ArrayList<String> left=  subSeqList(p+ch, up.substring(1)); // character is taken on processed string and store it on left array list
        ArrayList<String> right= subSeqList(p, up.substring(1));  // character is not taken on processed string and store it on right array list

        left.addAll(right);
        return left;
    }
}
