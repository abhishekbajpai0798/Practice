package Sorting;
import  java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,1,2,8,5,3};
        for (int i=1; i< arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
