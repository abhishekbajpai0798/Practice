package HashMap;
import java.util.*;
public class Convert_Integer2Roman {
    public static void main(String[] args) {
        int num=3;
        String ans="";
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        int arr[] ={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int i=0;
        while(num>0){
            int min=getMin(arr, num);
            ans+=map.get(min);
            num=num-min;
        }
        System.out.println(ans);

    }
    public static int getMin(int[] arr, int num){
        int min = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if(arr[i]<=num)
                min = arr[i];
        }
       return min;
    }
}
