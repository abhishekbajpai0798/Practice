package String;

import java.util.Arrays;

public class StringToInteger {
    public static void main(String[] args) {
        String s=" hi word 42";

        char[] ch = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            ch[i]=s.charAt(i);
        }
        // handle white spaces and index value
        int i=0;
        while(i<ch.length && ch[i]==' ') i++;

        int sign=1;
        if(ch[i]=='+' || ch[i]=='-'){
            sign=(ch[i]=='+'?+1:-1);
            i++;
        }
        //calculate result
        int ans=0;
        while(i<ch.length){
            if(Character.isDigit(ch[i])){
                ans=ans*10+(ch[i]-'0');
            }
            i++;
        }
        System.out.println(ans*sign);

    }
}
