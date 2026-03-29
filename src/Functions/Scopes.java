package Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Scopes {
    static int c=10;
    public static void main(String[] args) {
        System.out.println(c);
        int c=40;
        System.out.println(c);
        int x=10;
        int y=20;
        sum(x,y);

        int arr[] = {1,2,3,4,5};
        //swap(arr,0,1);
        //System.out.println(Arrays.toString(arr));

        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int sum(int a,int b){
        return a+b;
    }

    public static void swap(int[] arr, int i,int j){
       int temp = arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    public static void revArr(int[] arr){
        int s=0;
        int e=arr.length-1;
        System.out.println("check");
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    //primitive => int, char, float, double => mem => stack => fast
    //non-primitive => array, string, arraylist, hashmap, collection mem => heap => slow

    // int, char, float => 0, ,0.0 => primitive
    // wraper classes Integer=> null, Float, String,

    //ArrayList<Integer> list = new ArrayList<Integer>();

}
