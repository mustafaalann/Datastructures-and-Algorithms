public class LinkedList {

    Node tail = new Node(-1);      //the tail is to show the end of the list.
    Node head = new Node(-1);      //the head is to show the beginning of the list.


    boolean isEmpty(){             //we check if the LinkedList list is empty
        return head.next == null;
    }


    public void addNode(int a){
        Node newNode = new Node(a);
        if(isEmpty()){                      //if the list is empty then we put our node between head and tail
            head.next = newNode;
            newNode.prev = head;
            newNode.next = tail;
            tail.prev = newNode;
        }
        else {                             //if the list is not empty we put our node between the tail and the last node
            tail.prev.next = newNode;
            newNode.prev = tail.prev;
            tail.prev = newNode;
            newNode.next = tail;
        }
    }


    public void printList(Node head){

        if(head.next.data != -1){               //We print all the data in the list recursively, until the tail.
            System.out.println(head.next.data);
            printList(head.next);
        }
    }

    public void removeData(int data){            //We create a controller to move on the all nodes one by one and check their data.
        Node controller = head.next;
        while(controller.next != null){
            if(controller.data == data){
                controller.prev.next = controller.next;
                controller.next.prev = controller.prev;
                return;
            }
            controller = controller.next;
        }
        System.out.println("the data is not found !!!");
    }

    public void removeIndex(int index){     // We do the same thing with removeData but here we use counter to delete and check if statement.
        int counter = 0;
        Node controller = head.next;
        while(controller.next != null){
            if(counter == index){
                controller.prev.next = controller.next;
                controller.next.prev = controller.prev;
                return;
            }
            counter++;
            controller = controller.next;
        }
        System.out.println("The index is not found!");
    }

}
