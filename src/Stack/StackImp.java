package Stack;

import java.util.Stack;

public class StackImp {
    public static void main(String[] args) {
        int arr[]={2,5,7,9,10};
        Stack<Integer> st = new Stack<>();
        //add a element in stack
        for (int i: arr){
            st.push(i);
        }
        System.out.println(st);

        System.out.println(st.peek());// => 10 return top elem in stack
        st.pop();
        System.out.println(st.pop());// => 9 remove top or peek elem from the stack
        System.out.println(st.empty()); // t/f if stack is empty or not


    }
}
