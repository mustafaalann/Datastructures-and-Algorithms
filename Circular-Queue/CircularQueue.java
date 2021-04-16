public class CircularQueue {
    private int front,rear;
    private int[] array;

    public CircularQueue(int size) {
        this.front = this.rear = -1;
        this.array = new int[size];
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public boolean isFull(){
        return (rear+1) % array.length == front;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("The queue is full !!");
        }
        else if(isEmpty()){
            front++;
        }
        rear = (rear+1) % array.length;
        array[rear] = data;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is EMPTY!");
            return -1;
        }
        else{
            int temp = array[front];
            front = (front+1) % array.length;
            return temp;
        }
    }

    public void printQueue(){
        int temp = front;
        while (temp!=rear+1){
            System.out.println(array[temp]);
            temp = (temp+1) % array.length;
        }

    }








}
