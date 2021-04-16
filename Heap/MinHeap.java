public class MinHeap {
    private int[] theHeap;
    private int size;
    private int maxsize;


    public MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        theHeap = new int[this.maxsize];
    }

    public void add(int value){
        if(isFull()){          //Check if the heap is full ?
            System.out.println("The Heap is FULL!!! you can not add anything");
        }
        size++;
        theHeap[size] = value;              //We add the value to our new index
        controlHeap(size);
    }
    private void controlHeap(int index){
        while(index !=1){                  //Because when index is 1 it will be the top element
            if(theHeap[index] < theHeap[index/2]){        //we check if child is bigger than parent
                int controller = theHeap[index/2];        //First we keep the parent value in a variable
                theHeap[index/2] = theHeap[index];        //We change parent with the child
                theHeap[index] = controller;              //We change child with the parent
                index = index/2;                          //We move 1 up to check now
            }
            else{
                return;
            }
        }
    }

    public boolean isFull(){
        if(size==maxsize){         //check if the size is equal to maxsize
            return true;
        }
        return false;
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {               //To check if our heap is working fine.
            if(theHeap[i]==0 || theHeap[i]==Integer.MAX_VALUE){         //We check if the item is 0 or max_Value(means removeMin function is used)
                System.out.println("            PARENT : " + " ");
            }
            else {
                System.out.println("            PARENT : " + theHeap[i]);
            }

            if(theHeap[2*i]==0 || theHeap[2*i]==Integer.MAX_VALUE){
                System.out.print(" LEFT CHILD : " + " "+"    ");
            }
            else {
                System.out.print(" LEFT CHILD : " + theHeap[2 * i]+"    ");
            }

            if(theHeap[2*i+1]==0 || theHeap[2*i+1]==Integer.MAX_VALUE){
                System.out.println(" RIGHT CHILD :" + " ");
            }
            else {
                System.out.println(" RIGHT CHILD :" + theHeap[2 * i + 1]);
            }

            System.out.println();
        }
    }

    public void removeMin(){
        theHeap[1] = theHeap[size];
        theHeap[size] = Integer.MAX_VALUE;
        size--;
        int index = 1;
        while(index < size){
            if((index < theHeap[index*2] && 0 == theHeap[index*2+1] )|| (0 == theHeap[index*2] && index < theHeap[index*2+1]) || (0 == theHeap[index*2] && 0 == theHeap[index*2+1])){
                break;                //This is to control over comparing when index is smaller than size but we are at the end.
            }
            if( theHeap[index*2] < theHeap[(index*2)+1] ){          //is left child smaller than right child ?
                int controller = theHeap[index*2];                  //We keep the childs value
                theHeap[index*2] = theHeap[index];                  //We change childs value to parent
                theHeap[index] = controller;                        //We change parents value to child(which we kept by controller)
                index = index*2;                                    //We move 1 step below
            }
            else{                                                   //right child is smaller then left child.
                int controller = theHeap[(index*2)+1];
                theHeap[(index*2)+1] = theHeap[index];
                theHeap[index] = controller;
                index = (index*2)+1;
            }
        }


    }








}
