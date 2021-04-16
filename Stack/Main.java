public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);      //initializing our stack
        myStack.push(1);                  //pushing the elements until 5
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);                  //The 6th element can not be added into the Stack because the size is 5

        System.out.println("The Element " + myStack.peek() + " is peeked");    //peeking the top element from the Stack which is 5

        System.out.println("The Element " + myStack.pop() + " is popped");     //popping the top element on the Stack which is 5

        System.out.println("The Element " + myStack.peek() + " is peeked");    //peeking the top element from the Stack which is 4


        myStack.printStack();                  //Printing the elements in the Stack

        System.out.println("The size of the Stack is = " + myStack.size());
    }
}
