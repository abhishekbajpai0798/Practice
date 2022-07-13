package Subset;

public class SubSeqAscii {
    public static void main(String[] args) {
        asciiSeq("", "abc");
    }
    public static void asciiSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p + " ");
            return;
        }
        char ch=up.charAt(0);
        asciiSeq(p+ch, up.substring(1));
        asciiSeq(p,up.substring(1));
        asciiSeq(p+(ch+0),up.substring(1));
    }
}
