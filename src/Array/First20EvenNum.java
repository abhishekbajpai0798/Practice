import java.util.*;
public class First20EvenNum {
    public static void main(String[] args) {
        int num=50;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1; i<=num && list.size()<20; i++){
            if(i%2==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
