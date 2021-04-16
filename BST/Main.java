public class Main {
    public static void main(String[] args) {
        BST myBST = new BST();
        myBST.addNode(5);
        myBST.addNode(3);
        myBST.addNode(19);
        myBST.addNode(1);
        myBST.addNode(4);
        myBST.printInfoRecursively(myBST.root);
        myBST.removeNode(3);
        myBST.printInfoRecursively(myBST.root);

    }
}
