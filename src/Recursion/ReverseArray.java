package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        revArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void revArray(int[] arr, int s, int e) {
        if(s>=e){
            return;
        }
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        revArray(arr, s+1, e-1);
    }
}
