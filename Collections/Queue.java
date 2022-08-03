package Collections;

@SuppressWarnings("all")
public class Queue <T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void enqueue(T data){
        var newNode = new Node<T>(data);
        size++;

        if (first == null){
            first = newNode;
            last = newNode;
            return;
        }

        last.next = newNode;
        last = newNode;
    }

    public T dequeue(){
        if (first == null) {
            return null;
        }

        var returningNode = first;

        if (first.next != null){
            first = first.next;
        }

        size--;
        return returningNode.data;
    }

    public int size(){
        return this.size;
    }

    
    // INTERNAL DATA STRUCTURE NODE
    private class Node <T> {
        private T data;
        private Node<T> next;

        /**
         * 
         * @param data Internal data of node, generic type T
         */
        Node(T data){
            this.data = data;
            next = null;
        }

    }

}
