public class Stack {
    private final int[] array;
    private final int capacity;
    private int top;

    Stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("The stack is full!! You can not add " + data);
        } else {
            array[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is EMPTY");
            return -1;
        } else {
            return array[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is EMPTY");
            return -1;
        } else {
            return array[top];
        }
    }


    public void printStack() {
        if (isEmpty()) {
            System.out.println("The Stack is empty !");
        } else {
            System.out.println("The items in the stack are :");
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i]);
            }

        }

    }

    public int size() {
        return top + 1;
    }


}
