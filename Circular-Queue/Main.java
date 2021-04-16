public class Main {
    public static void main(String[] args) {
        CircularQueue myQueue = new CircularQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        myQueue.dequeue();

        myQueue.printQueue();
    }
}
