package Collections;

public class BinaryTree {

    private Node root;
    private int size = 0;

    public void add(int data){
        var newNode = new Node(data);

        if (root == null){
            root = newNode;
            return;
        } else {
            root = add(root, newNode);
        }

    }

    private Node add(Node currentNode, Node newNode){
        if (currentNode == null){
            this.size++;
            return newNode;
        } 

        if (currentNode.data < newNode.data){
            currentNode.right = add(currentNode.right, newNode);
        } else if (currentNode.data > newNode.data){
            currentNode.left = add(currentNode.left, newNode);
        }

        return currentNode;
    }

    public void remove(int key){
        
    }

    private void remove(Node currentNode, Node selectedNode){

    }

    public void traverseInOrder(){
        if (root == null) return;
        traverseInOrder(root);
    }

    private void traverseInOrder(Node currentNode){
        if (currentNode.left != null) traverseInOrder(currentNode.left);
        System.out.print(currentNode.data + ", ");
        if (currentNode.right != null) traverseInOrder(currentNode.right);
    }

    public void traversePreOrder(){
        if (root == null) return;
        traversePreOrder(root);
    }

    private void traversePreOrder(Node currentNode){
        System.out.print(currentNode.data + ", ");
        if (currentNode.left != null) traversePreOrder(currentNode.left);
        if (currentNode.right != null) traversePreOrder(currentNode.right);
    }

    public void traversePostOrder(){
        if (root == null) return;
        traversePostOrder(root);
    }

    private void traversePostOrder(Node currentNode){
        if (currentNode.left != null) traversePostOrder(currentNode.left);
        if (currentNode.right != null) traversePostOrder(currentNode.right);
        System.out.print(currentNode.data + ", ");
    }

    // Internal data structure -> Node
    private class Node {
        
        private int data;
        private Node left;
        private Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
}
