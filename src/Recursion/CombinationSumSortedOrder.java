package Recursion;

import java.util.*;
public class CombinationSumSortedOrder {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ans1= new ArrayList<>();
        List<List<Integer>> ans2= new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        //repetition allowed
        getCombination1(0,arr,ans1,ds,target);
        System.out.println(ans1);
        //repetition not allowed
        getCombination2(0,arr,ans2,ds,target);
        System.out.println(ans2);
    }
    public static void getCombination1(int idx,int[] arr,List<List<Integer>> ans,List<Integer> ds,int tar){
        if(tar==0){
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>tar){
                break;
            }
            ds.add(arr[i]);
            getCombination1(idx+1, arr, ans, ds, tar-arr[i]); //idx+1 => repetition not allowed
            ds.remove(ds.size()-1);
        }
    }

    public static void getCombination2(int idx,int[] arr,List<List<Integer>> ans,List<Integer> ds,int tar){
        if(tar==0){
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>tar){
                break;
            }
            ds.add(arr[i]);
            getCombination2(i+1, arr, ans, ds, tar-arr[i]); //i+1 => repetition not allowed
            ds.remove(ds.size()-1);
        }
    }
}
