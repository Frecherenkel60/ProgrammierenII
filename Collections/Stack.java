package Collections;

public class Stack<T> {

    private Node<T> top;
    private int size = 0;

    public void push(T data){
        var newNode = new Node<T>(data);
        size++;

        if (top != null){
            newNode.prev = top;
        }
        
        top = newNode;
        return;
    }

    public T pop(){
        if (top == null) return null;
        return top.data;
    }

    public T peek(){
        if (top == null) return null;
        
        var returningNode = top;
        top = top.prev;
        return returningNode.data;
    }

    public int size(){
        return this.size;
    }
    
    // Internal data structure Node
    private class Node<T> {

        private T data;
        private Node<T> prev;

        Node(T data){
            this.data = data;
            this.prev = null;
        }

    }

}
