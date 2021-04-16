public class Main {
    public static void main(String[] args) {
        MinHeap myHeap = new MinHeap(10);
        myHeap.add(10);
        myHeap.add(9);
        myHeap.add(8);
        myHeap.add(7);
        myHeap.add(11);
        myHeap.removeMin();
        myHeap.add(3);
        myHeap.add(6);
        myHeap.removeMin();
        myHeap.print();


    }


}
