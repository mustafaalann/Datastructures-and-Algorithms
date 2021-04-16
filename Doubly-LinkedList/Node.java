public class Node {
    int data;           //The data we keep in our nodes
    Node next;          //Every node has one next node and one previous node in order to have doubly linked list.
    Node prev;

    public Node(int data) {       //constructor
        this.data = data;
    }
}
