package Recursion;

import java.util.*;

public class KthPermutation {
    public static void main(String[] args) {
        int num[]={1,2,3};
        int n=3;
        int k=4;
        boolean visited[]=new boolean[n];
        List<Integer> sublist = new ArrayList<>();
        List<List<Integer>> list= new ArrayList<>();
        getPermutation(num,visited,list,sublist);
        System.out.println(list);
        System.out.println(list.get(k-1));
    }

    private static void getPermutation(int[] num, boolean visited[], List<List<Integer>> list, List<Integer> sublist) {
        if(sublist.size()== num.length){
            list.add(new ArrayList<>(sublist));
            return;
        }
        for(int i=0; i<num.length; i++){
            if(visited[i]!=true){
                visited[i]=true;
                sublist.add(num[i]);
                getPermutation(num, visited, list, sublist);
                sublist.remove(sublist.size()-1);
                visited[i]=false;
            }
        }
    }
}
