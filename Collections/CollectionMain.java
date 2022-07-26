package Collections;

import java.util.Random;

public class CollectionMain {

    public static void main(String[] args) {
        // testQueue();
        // testStack();
        // testLinkedList();
        // testDoubleLinkedList();
        testBinaryTree();
    }

    private static void testBinaryTree() {
        var tree = new BinaryTree();

        Random r = new Random();

        for(int i = 0; i < 100; i++){
            tree.add(r.nextInt(1000));
        }

        System.out.println("In-Order-Traversal: \n");
        tree.traverseInOrder();

        System.out.println("\nPre-Order-Traversal: \n");
        tree.traversePreOrder();

        System.out.println("\nPost-Order-Traversal: \n");
        tree.traversePostOrder();
    }

    private static void testDoubleLinkedList() {
        var linkedList = new DoubleLinkedList<String>();

        linkedList.add("Hello");
        linkedList.add("there!");
        linkedList.add("It's");
        linkedList.add("so");
        linkedList.add("nice");
        linkedList.add("to meet you!");

        var size = linkedList.size();
        for(int i = 0; i < size; i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println();

        linkedList.remove("so");
        linkedList.remove(1);
        size = linkedList.size();
        for (int i = 0; i < size; i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println();

        linkedList.insert("Mf!", 2);
        size = linkedList.size();
        for (int i = 0; i < size; i++){
            System.out.println(linkedList.get(i));
        }
    }

    private static void testLinkedList() {
        var linkedList = new LinkedList<String>();

        linkedList.add("Hello");
        linkedList.add("there!");
        linkedList.add("It's");
        linkedList.add("so");
        linkedList.add("nice");
        linkedList.add("to meet you!");

        var size = linkedList.size();
        for(int i = 0; i < size; i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println();

        linkedList.remove("so");
        linkedList.remove(1);
        size = linkedList.size();
        for (int i = 0; i < size; i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println();

        linkedList.insert("Mf!", 2);
        size = linkedList.size();
        for (int i = 0; i < size; i++){
            System.out.println(linkedList.get(i));
        }
    }

    private static void testStack(){
        var stack = new Stack<Integer>();

        for (int i = 0; i < 1000; i += 13) {
            stack.push(i);
            System.out.println("Pushed -> " + i);
        }

        System.out.println("Queue size -> " + stack.size());
        var currSize = stack.size();

        for (int i = 0; i < currSize; i++) {
            System.out.println("Peeked -> " + stack.peek() + " // Popped -> " + stack.pop() + "loop nr: " + i);
        }

        System.out.println("Queue size -> " + stack.size());
    }

    private static void testQueue() {
        var queue = new Queue<Integer>();

        for (int i = 0; i < 1000; i += 13) {
            queue.enqueue(i);
            System.out.println("Enqueued -> " + i);
        }

        System.out.println("Queue size -> " + queue.size());
        var currSize = queue.size();

        for (int i = 0; i < currSize; i++) {
            System.out.println("Dequeued -> " + queue.dequeue() + "loop nr: " + i);
        }

        System.out.println("Queue size -> " + queue.size());
    }
}
