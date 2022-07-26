package Collections;

import javax.swing.JButton;

public class LinkedList <T> {

    private Node<T> first;
    private int size = 0;

    public void add(T data){
        var newNode = new Node<T>(data);

        if (first == null){
            first = newNode;
        } else {
            var lastNode = first;
            while (lastNode.next != null) lastNode = lastNode.next;
            lastNode.next = newNode;
        }

        size++;
    }
    
    public void insert(T data, int index){
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        var newNode = new Node<T>(data);
        var prevNode = first;

        while(--index != 0) prevNode = prevNode.next;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    public void remove(int index){
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        var prevNode = first;

        while (--index != 0) prevNode = prevNode.next;
        prevNode.next = prevNode.next.next;
        size--;
    }

    public void remove(T key){
        var prevNode = first;

        if (first.data == key){
            first = first.next;
            return;
        }

        while(prevNode.next.data != key) prevNode = prevNode.next;
        prevNode.next = prevNode.next.next;
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
            if (indexNode.data == data) return true;
            indexNode = indexNode.next;
        }
        return false;
    }

    public int size(){
        return this.size;
    }
    

    // Internal data structure -> Node
    private class Node <T>  {

        private T data;
        private Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }

    }

}
