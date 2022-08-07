package String;

public class CheckAnagram_Optimise {
    public static void main(String[] args) {
        String s1="a";
        String s2="ab";
        int counter[]=new int[26];

        for (int i=0;  i<s1.length(); i++){
            counter[s1.charAt(i)-'a']++;
            counter[s2.charAt(i)-'a']--;
        }
        //print statement
        for (int i: counter){
            System.out.print(i+" ");
        }

        System.out.println();//line change

        boolean flag=true;
        for (int i=0; i<counter.length; i++){
            if(counter[i]!=0){
               flag=false;
               break;
            }
        }
        if(flag){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }

}
