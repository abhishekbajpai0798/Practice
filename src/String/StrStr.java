package String;

public class StrStr {
    public static void main(String[] args) {
        String haystack="abbbba";
        String needle="bbbb";
        if(needle.equals(""))
            System.out.println(0);
        int hay_len=haystack.length();
        int n_len=needle.length();
        if(hay_len<n_len)
            System.out.println(-1);
        else
        {
            String temp="";
            int x=n_len;
            for(int i=0;i<=hay_len-n_len;i++)
            {
                temp=haystack.substring(i,i+x);
                System.out.println(temp);
                if(temp.equals(needle))
                    System.out.println(i);
            }
        }
    }

}
