package Collections;

public class BinaryTree<T> {

    private Node<T> root;
    private int size = 0;

    public void add(T data){
        var newNode = new Node<T>(data);

        if (root == null){
            root = newNode;
            return;
        } else {
            root = add(root, newNode);
        }

    }

    private Node<T> add(Node<T> currentNode, Node<T> newNode){
        if (currentNode == null){
            this.size++;
            return newNode;
        } 

        var compareToResult = ((Comparable)currentNode.data).compareTo((Comparable)newNode.data);

        if (compareToResult < 0){
            currentNode.right = add(currentNode.right, newNode);
        } else if (compareToResult > 0){
            currentNode.left = add(currentNode.left, newNode);
        } else if (compareToResult == 0) {
            return currentNode;
        }

        return currentNode;
    }

    public void remove(T key){
        if (root == null) return;
        remove(root, key);
    }

    private Node<T> remove(Node<T> currentNode, T selectedNode){
        var compareToResult = ((Comparable<T>) currentNode.data).compareTo(selectedNode);

        if (compareToResult < 0){
            currentNode.right = remove(currentNode.right, selectedNode);
        } else if (compareToResult > 0) {
            currentNode.left = remove(currentNode.left, selectedNode);
        } else {
            // correct node
            if (currentNode.left == null) return currentNode.right;
            if (currentNode.right == null) return currentNode.left;
            // node has two children
            // we need to find the most-less value on the right side
            var traverseNode = currentNode.right;
            while (traverseNode.left != null) traverseNode = traverseNode.left;
            currentNode.data = traverseNode.data;
            remove(currentNode.right, traverseNode.data);
        }

        return currentNode;
    }

    public void traverseInOrder(){
        if (root == null) return;
        traverseInOrder(root);
    }

    private void traverseInOrder(Node<T> currentNode){
        if (currentNode.left != null) traverseInOrder(currentNode.left);
        System.out.print(currentNode.data + ", ");
        if (currentNode.right != null) traverseInOrder(currentNode.right);
    }

    public void traversePreOrder(){
        if (root == null) return;
        traversePreOrder(root);
    }

    private void traversePreOrder(Node<T> currentNode){
        System.out.print(currentNode.data + ", ");
        if (currentNode.left != null) traversePreOrder(currentNode.left);
        if (currentNode.right != null) traversePreOrder(currentNode.right);
    }

    public void traversePostOrder(){
        if (root == null) return;
        traversePostOrder(root);
    }

    private void traversePostOrder(Node<T> currentNode){
        if (currentNode.left != null) traversePostOrder(currentNode.left);
        if (currentNode.right != null) traversePostOrder(currentNode.right);
        System.out.print(currentNode.data + ", ");
    }

    // Internal data structure -> Node
    private class Node<T> {
        
        private T data;
        private Node<T> left;
        private Node<T> right;

        Node(T data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
}
