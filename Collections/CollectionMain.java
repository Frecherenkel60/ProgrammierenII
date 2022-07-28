package Collections;

import java.util.Random;

@SuppressWarnings("all")
public class CollectionMain {

    public static void main(String[] args) {
        // testQueue();
        // testStack();
        // testLinkedList();
        // testDoubleLinkedList();
        // testBinaryTree();
        // testBinaryRemove();
        testToString();
    }

    private static void testToString() {
        var tree = new BinaryTree<String>();

        tree.add("Justus");
        tree.add("Gabi");
        tree.add("Adam");
        tree.add("Ina");
        tree.add("Hans");
        tree.add("Isa");
        tree.add("Vicki");
        tree.add("Dori");

        System.out.println(tree.toString());
    }

    private static void testBinaryRemove() {
        var tree = new BinaryTree<Integer>();

        tree.add(50);
        tree.add(48);
        tree.add(70);
        tree.add(65);
        tree.add(67);
        tree.add(66);
        tree.add(67);
        tree.add(90);
        tree.add(69);
        tree.add(98);
        tree.add(94);
        tree.add(99);
        tree.add(30);
        tree.add(32);
        tree.add(35);
        tree.add(31);
        tree.add(20);
        tree.add(15);
        tree.add(25);
        tree.add(27);

        System.out.println("Before removing:");
        tree.traverseInOrder();

        tree.remove(30);
        tree.remove(90);

        System.out.println("\nAfter removing:");
        tree.traverseInOrder();
    }

    private static void testBinaryTree() {
        var tree = new BinaryTree<Integer>();

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
        linkedList.remove("to meet you!");

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
