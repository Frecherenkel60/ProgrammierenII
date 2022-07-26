package Collections;

public class DoubleLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void add(T data){
        var newNode = new Node<T>(data);

        if (first == null){
            first = newNode;
            last = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }

        size++;
    }

    public void insert(T data, int index){
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        var newNode = new Node<T>(data);
        var prevNode = first;

        while(--index != 0) prevNode = prevNode.next;
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    public void remove(T key){
        var selectedNode = first;

        if (first.data.equals(key)){
            first = first.next;
            first.prev = null;
            return;
        } else if (last.data.equals(key)){
            last = last.prev;
            last.next = null;
        }

        while(!selectedNode.data.equals(key)) selectedNode = selectedNode.next;
        selectedNode.next.prev = selectedNode.prev;
        selectedNode.prev.next = selectedNode.next;
        size--;
    }

    public void remove(int index){
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        var selectedNode = first;

        while (index-- != 0) selectedNode = selectedNode.next;
        selectedNode.next.prev = selectedNode.prev;
        selectedNode.prev.next = selectedNode.next;
        size--;
    }

    public T get(int index){
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        var indexNode = first;

        while(index-- != 0) indexNode = indexNode.next;
        return indexNode.data;
    }

    public boolean contains(T data){
        var indexNode = first;

        while (indexNode != null){
            if (indexNode.data.equals(data)) return true;
            indexNode = indexNode.next;
        }
        return false;
    }
    
    public int size(){
        return this.size;
    }

    // Internal data structure -> Node
    private class Node<T> {

        private T data;
        private Node<T> prev;
        private Node<T> next;
        
        Node(T data){
            this.data = data;
            prev = null;
            next = null;
        }

    }

}
