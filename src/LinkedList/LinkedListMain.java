package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       this.next = null;
    }
}

class LinkedListImp{
    static Node head;

    public static void insert(int data){
        Node newNode = new Node(data);

        // If list is empty
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void deleteNode(int data){
        if(head == null){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.printList();
    }

}
