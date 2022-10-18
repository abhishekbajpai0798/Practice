package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int n= arr.length;
        bubbleSort(arr,0,n-1);
    }
    private static void bubbleSort(int[] arr, int i, int j) {
        int n= arr.length;
        if(j==0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(i<j){
            if(arr[i]>arr[i+1]){
                //swap
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            bubbleSort(arr,i+1,j);
        }
        else{
            bubbleSort(arr,0,j-1);
        }
    }
}
