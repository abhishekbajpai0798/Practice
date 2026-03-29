package Tree;

public class BinaryTreeImp {
    // Created the Node class
//              10
//             /  \
//             5    20
//             / \
//             3   7
    private static class Node{   // Yeh Node ek single box hai. Is box ke andar 3 cheezein hain:
        int val; //Yeh box ke andar rakha hua number hai.[ 10 ]
        Node left; //Is box ka left wala dost 5 Toh left me hum next box ka address rakhte hain.
        Node right; //Is box ka right wala dost Toh right me 20 wala box ka address rahega.

        Node(int val){ // created the constructor Jab tum likhte ho: Node n = new Node(10); Ek naya box banata hai 📦
            this.val = val; // Us box me 10 daal deta hai
            this.left = null; // Left ko khali (null) rakhta hai
            this.right = null; // Right ko khali (null) rakhta hai
        }

        public static void main(String[] args) {

            // Basic insertion in the BT
            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(20);


            root.left.left = new Node(3);
            root.left.right = new Node(7);

//            Tree ko directly System.out.println(root); se print nahi kar sakte
//            Hume traversal use karna padega
//            there are 3 types of traversal below:
//            1. Inorder Print (Left → Root → Right) //3 5 7 10 20
              inOrder(root); // Inorder calling.
              System.out.println();
//            2. Preorder Print (Root → Left → Right)//10 5 3 7 20
              preOrder(root); // Preorder calling.
              System.out.println();
//            3. Postorder Print (Left → Right → Root)//3 7 5 20 10
              postOrder(root);
//            4. Level Order
        }
        public static void inOrder(Node root){
            if(root == null) return;

            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
        public static void preOrder(Node root){
            if(root == null) return;

            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null) return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }

    }
}
