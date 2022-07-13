package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str="abcd";
        String res=revString(str);
        System.out.println(res);
        System.out.println(getReverser(str,str.length()-1));
    }

    //method1
    private static String revString(String str) {
        if(str.isEmpty()){
            return str;
        }
        return revString(str.substring(1)) + str.charAt(0);
    }
    //method2
    public static String getReverser(String in, int i)
    {
        if (i < 0)
            return "";
        else
            return in.charAt(i) + getReverser(in, i-1);
    }

}
