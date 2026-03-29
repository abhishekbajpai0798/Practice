package GenericTree;

import java.util.ArrayList;
import java.util.*;

public class GenericTreeImplement {
    public static class Node{
        int data; // store the value of that node
        // Generic Tree Node must store multiple children So you need a dynamic list to store them.ArrayList<Node> allows you to add children as the tree grows.
        ArrayList<Node> child = new ArrayList<>();
    }

    //Build the tree
    public static void buildTree(int[] arr){
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int i=0; i< arr.length; i++){
            Node temp = new Node();
            temp.data = arr[i];
            if(st.isEmpty()){
                root=temp;
            }else if (arr[i]==-1) {
                st.pop();
            }
            else{
                st.peek().child.add(temp);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

    }

}
