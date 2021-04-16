public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();

        myLinkedList.addNode(5);        //Adding our integer datas to our LinkedList
        myLinkedList.addNode(2);
        myLinkedList.addNode(1);
        myLinkedList.addNode(3);

        myLinkedList.removeIndex(0);       //Removing the first index

        myLinkedList.removeData(2);        //Removing the Node with the data 2.
        myLinkedList.removeData(20);         //To check if data is in the list

        myLinkedList.printList(myLinkedList.head);        //check the print function.

        myLinkedList.removeIndex(1);       //Removing the second index

        myLinkedList.printList(myLinkedList.head);
    }
}
