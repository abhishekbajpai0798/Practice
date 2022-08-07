package String;

public class OrderCharacter {
    public static void main(String[] args) {
        String s1="AAAAAAAAAAABBBDDDDAABB";
        String str="";
        for (int i=0;  i<s1.length(); i++) {
            int count=1;
            int j=i;
            while(j<s1.length()-1 && s1.charAt(i)==s1.charAt(j+1)){
                    count++;
                    j++;
                }

            i=j;

            if(count<9){
                str=s1.charAt(i)+""+count+" ";
                System.out.print(str);
            }
            else{
                int g=count/9;
                int h=count%9;
                while (g!=0){
                    str+=s1.charAt(i)+""+9+" ";
                    g--;
                }
                str+=s1.charAt(i)+""+h+" ";
                System.out.print(str);
            }
        }
    }
}
