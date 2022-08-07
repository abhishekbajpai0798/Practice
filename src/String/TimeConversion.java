package String;
public class TimeConversion {
    public static void main(String[] args) {
        String s="12:45:54PM";
        StringBuilder sb=new StringBuilder();
        Boolean flag=false;
        if(s.contains("PM")){ flag=true;}

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch) || ch==':'){
                sb.append(ch);
            }
        }

        if(flag){
            String str=sb.substring(0,2);
            int x=Integer.parseInt(str)+12;
            String t=Integer.toString(x);
            if(str.equals("12") && s.contains("PM")){
                System.out.println(sb);
            }
            sb.replace(0,2,t);
        }
        else{
            String str=sb.substring(0,2);
            if(str.equals("12") && s.contains("AM")){
                sb.replace(0,2,"00");
            }
        }
        System.out.println(sb);
    }
}
