import java.util.Arrays;

public class AsciiValue {
    public static void main(String[] args) {
//        char ch='a';
//        System.out.println(ch+0);
//        System.out.println(ch+1);
//        System.out.println((char)(ch+5));

        String str1 = "Abhi";
        String str2 = "Abhi";
        System.out.println(str1==str2); //false

        int[] freq = new int[26];
        String str = "charu";

        int n= freq.length;
        int size = str.length();

        for (int i=0; i<size; i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        System.out.println(Arrays.toString(freq));

        StringBuilder sb =new StringBuilder();
        for(int i =0; i<25; i++){
            if(freq[i]>0){
                sb.append((char)(i+'a'));
                freq[i]--;
            }
        }
        System.out.println(sb);



    }
}


//string => immutable => abc abcd
//StringBuilder => mutable => less time => abcd
