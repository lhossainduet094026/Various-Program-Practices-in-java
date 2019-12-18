package linkedlistimplementationexample;

class Node {

    int data;
    Node next;
}
class LinkedList {

    Node head;
//add element in the last 

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {//traversing from head to last node 
                n = n.next;
            }
            //adding node last 
            n.next = node;
        }
    }
// show all the element in the linkedlist 

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        //printing last node data
        System.out.println(node.data);
    }

    //add element at first of the list
    public void insertAtFirst(int data) {
        Node node = new Node();//creating a node which will insert at first
        node.data = data;
        node.next = null;
        //change head as new node next 
        node.next = head;
        //assign head pointer to the new node
        head = node;

    }

    public void insertAt(int index, int data) {
        //created new node
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {//if index is o then call insertAt() method
            insertAtFirst(data);
        } else {
            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("data" + n1.data + " is deleted.");
            n1 = null;//remove form memory necessary for garbase collection 
        }
    }
}

public class LinkedListImplementationExample {

    public static void main(String[] args) {
        /*    //Node creation

        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        //connecting all nodes
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = null;
         */
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertAtFirst(40);
        list.insertAt(2, 55);

        list.show();
        list.deleteAt(2);
        list.show();
    }

}
