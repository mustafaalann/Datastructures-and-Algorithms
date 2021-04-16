public class BST {
    Node root;

    public BST(){
        this.root = null;
    }

    public void addNode(int value){
        this.root = addNodeRecursively(this.root,value);
    }  //where we call the recursive function

    public Node addNodeRecursively(Node root, int value){     //this is the part where we move the root down to compare one by one (recursively).
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value){               //To go to the left side
                root.left = addNodeRecursively(root.left,value);
        }
        else if(value > root.value){             //To go to the right side
                root.right = addNodeRecursively(root.right,value);
        }
        return root;
    }

    public void removeNode(int value){
        this.root = removeRecursively(this.root, value);
    }

    public Node removeRecursively(Node root,int value){

        if(root == null){
            return root;
        }
        if(value > root.value){
            root.right = removeRecursively(root.right,value);          //similar to add method
        }
        else if(value < root.value){
           root.left = removeRecursively(root.left,value);            //similar to add method
        }
        else if(value == root.value){
            if(root.left == null){
                return  root.right;
            }
            else if (root.right==null){
                return root.left;
            }

            root.value = getMin(root.right);

            root.right = removeRecursively(root.right,root.value);  //right child side structure will be changed.

        }
        return root;
    }

    public int getMin(Node root){    //This is to change the value of the node that we want to delete with the one which is smallest from the right child(We will put right child inside).
        int control = root.value;
        while (true) {
            if (root.left != null) {
                root = root.left;
            }
            else{
                root = null;
                break;
            }
        }


        return control;
    }


    public void printInfoRecursively(Node root){
        if (root!=null){
            System.out.println(root.value);
            printInfoRecursively(root.left);
            printInfoRecursively(root.right);
        }
    }


}
