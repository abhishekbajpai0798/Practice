package String;
import java.util.Stack;

public class EncryptString {
    public static void main(String[] args) {
       String inp="43AAh*ck0rr0nk";

        Stack<Character> st=new Stack<>();
        StringBuilder sb= new StringBuilder();
       for (int i=0; i<inp.length(); i++){
           char ch=inp.charAt(i);
           if(Character.isDigit(ch) && ch!='0'){
               st.push(ch);
           }
           if (Character.isUpperCase(ch) && Character.isLowerCase(inp.charAt(i+1))){
               sb.append(inp.charAt(i+1));
               sb.append(inp.charAt(i));
               i=i+2;
           }
           if(Character.isUpperCase(ch) && Character.isUpperCase(inp.charAt(i+1))){
               sb.append(ch);
           }
           if(ch=='0'){
                sb.append(st.peek());
                st.pop();
           }
           if(Character.isLowerCase(ch)){
               sb.append(ch);
           }
       }
        System.out.println(sb.toString());
    }
}
